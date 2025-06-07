
# Registro de Eventos Extremos

## 📌 Descrição:
Este é um aplicativo Android desenvolvido para registrar eventos extremos, como desastres naturais, acidentes e outros incidentes, com informações sobre o impacto, a localização e o número de pessoas afetadas. O app permite ao usuário inserir dados sobre o evento e visualizá-los posteriormente.

## 🛠 Funcionalidades:
- **Registro de eventos extremos**: O usuário pode inserir o nome do local, tipo de evento, grau de impacto, data e número de pessoas afetadas.
- **Visualização de participantes**: O app permite ver os eventos registrados com as informações fornecidas, incluindo o número de pessoas afetadas.
- **Validação de dados**: Campos obrigatórios são validados para garantir que o usuário preencheu todas as informações corretamente.
- **Telas principais**:
    - Tela inicial de registro de evento
    - Tela de ação para inserir os dados e confirmar
    - Tela com a confirmação dos dados inseridos

## 💡 **Tecnologias utilizadas**:
- Kotlin
- Android Studio
- RecyclerView
- AppCompatActivity
- Toast para mensagens de feedback

## 📱 **Capturas de tela**

### 1. Tela Inicial de Registro de Eventos:
![Tela Inicial](./screenshots/tela_inicial.png)

### 2. Tela de Ação com Campos Preenchidos:
![Tela de Ação](./screenshots/tela_acao.png)

### 3. Tela de Confirmação com Número de Pessoas Afetadas:
![Tela de Confirmação](./screenshots/tela_confirmacao.png)

## 📑 **Como rodar o projeto**:

1. **Baixe o projeto**: Faça o download do projeto ou clone o repositório.
   
2. **Abrir no Android Studio**: 
   - Abra o Android Studio.
   - Selecione **File > Open** e navegue até a pasta do projeto.

3. **Configuração do emulador/dispositivo**:
   - Certifique-se de ter um dispositivo Android conectado ou um emulador configurado.
   - Caso esteja utilizando um emulador, basta iniciar o emulador através do Android Studio.

4. **Compilar e executar**:
   - Clique em **Run** (o ícone de play verde) para compilar e executar o aplicativo.
   - O app será iniciado e você poderá visualizar as funcionalidades.

## ⚙️ **Possíveis erros e soluções**:

- **Erro de tema**: Se o aplicativo não abrir e você encontrar um erro relacionado ao tema (`Theme.AppCompat`), adicione o tema correto no `AndroidManifest.xml`.
- **Erro de `findViewById`**: Certifique-se de que os IDs de cada elemento da interface no XML correspondem aos usados no código Kotlin.

## 📝 **Licença**:

Este é um projeto pessoal desenvolvido para fins acadêmicos.
