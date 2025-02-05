package io.github.felipepedrosa.propertyenvinator

import ai.grazie.utils.normalizeAccents
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.ide.CopyPasteManager
import com.intellij.openapi.ui.Messages
import java.awt.datatransfer.StringSelection

class TransformToEnvVariableAction : AnAction() {

    override fun update(event: AnActionEvent) {
        val isPropertiesFile = event.getData(CommonDataKeys.PSI_FILE)
            ?.virtualFile
            ?.name?.contains("properties")
            ?: false

        event.presentation.isEnabledAndVisible = isPropertiesFile
    }

    override fun actionPerformed(event: AnActionEvent) {
        val editor = event.getData(CommonDataKeys.EDITOR) ?: return
        val selectedText = editor.selectionModel.selectedText

        if (selectedText.isNullOrBlank()) {
            Messages.showErrorDialog("Nenhuma propriedade selecionada", "Envinator")
            return
        }

        val transformed = selectedText
            .normalizeAccents()
            .replace(Regex("\\p{InCombiningDiacriticalMarks}+"), "")
            .replace(Regex("[^a-zA-Z0-9- .]"), "")
            .replace(Regex("[- .]+"), "_")
            .uppercase()

        CopyPasteManager.getInstance().setContents(StringSelection(transformed));

        Messages.showInfoMessage("Variável de ambiente copiada para a área de transferência: $transformed", "Envinator")
    }
}