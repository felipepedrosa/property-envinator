# Property Envinator

O **Property Envinator** é um plugin para o IntelliJ IDEA que transforma propriedades de arquivos `.properties` em variáveis de ambiente formatadas e as copia para a área de transferência. Ideal para desenvolvedores que trabalham com configurações e precisam converter propriedades em variáveis de ambiente rapidamente.

---

## Funcionalidades

- **Transformação Automática**: Converte propriedades selecionadas em variáveis de ambiente no formato `UPPER_SNAKE_CASE`.
- **Cópia para Área de Transferência**: Copia a variável de ambiente formatada diretamente para o clipboard.
- **Validação de Arquivo**: Funciona apenas em arquivos com extensão `.properties`.
- **Feedback Visual**: Exibe mensagens de sucesso ou erro após a execução.
- **Integração com Menu de Contexto**: A ação está disponível no menu de contexto do editor (botão direito).

---

## Como Usar

1. Abra um arquivo `.properties` no IntelliJ IDEA.
2. Selecione uma propriedade no arquivo (por exemplo, `app.name=MyApp`).
3. Clique com o botão direito e escolha a ação **"Envinator - Transformar Para ENV"**.
4. A propriedade será transformada em uma variável de ambiente (por exemplo, `APP_NAME`) e copiada para a área de transferência.
5. Uma mensagem de confirmação será exibida com a variável gerada.

---

## Instalação

1. Abra o IntelliJ IDEA.
2. Vá para **File > Settings > Plugins**.
3. Clique em **Marketplace** e pesquise por **"Property Envinator"**.
4. Clique em **Install** e reinicie o IDE.

---