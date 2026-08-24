# 🔐 PlainText App

**Gerenciador de Senhas Simples** desenvolvido com **Kotlin** + **Jetpack Compose**.

<p align="center">
  <img src="https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white" alt="Kotlin"/>
  <img src="https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white" alt="Android"/>
  <img src="https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white" alt="Jetpack Compose"/>
  <img src="https://img.shields.io/badge/Material%20Design%203-757575?style=for-the-badge&logo=materialdesign&logoColor=white" alt="Material Design 3"/>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Room-Database-FF6F00?style=flat-square&logo=android&logoColor=white" alt="Room"/>
  <img src="https://img.shields.io/badge/Navigation%20Compose-4285F4?style=flat-square&logo=android&logoColor=white" alt="Navigation"/>
  <img src="https://img.shields.io/badge/ViewModel-34A853?style=flat-square&logo=android&logoColor=white" alt="ViewModel"/>
  <img src="https://img.shields.io/badge/Coroutines-7F52FF?style=flat-square&logo=kotlin&logoColor=white" alt="Coroutines"/>
  <img src="https://img.shields.io/badge/Gradle-02303A?style=flat-square&logo=gradle&logoColor=white" alt="Gradle"/>
</p>

---

🔐 PlainText App — Documentação Completa do Projeto📌 Índice Geral da Documentação1. Visão Geral e README2. Wiki — Home3. Wiki — Arquitetura e Estrutura do Projeto4. Wiki — Configuração do Ambiente5. Wiki — Camada de Dados (Room Database)6. Wiki — UI e Navegação (Compose & Material 3)7. Wiki — Gerenciamento de Estado (ViewModel & Coroutines)8. Wiki — Roteiro de Implementação e Tarefas9. Wiki — Segurança e Limitações10. Wiki — Guia de Contribuição e Equipe1. Visão Geral e README📱 Sobre o ProjetoO PlainText App é um gerenciador de senhas simples e didático desenvolvido no âmbito do programa DevTITANS Hands-On Android. O seu propósito principal é servir como uma aplicação de estudo prático para consolidar os fundamentos e ferramentas do desenvolvimento Android nativo moderno.👥 Equipe de DesenvolvimentoNome do IntegrantePapel / ResponsabilidadesMurilo Rafael de AlcantaraDesenvolvimento e DocumentaçãoAbel Freire de AndradeDesenvolvimento e ArquiteturaWicttory Leônidas Pontes da SilvaDesenvolvimento UI/UXSergio Ademir Rocha do CarmoDesenvolvimento e Persistência de DadosEmanuel Thiago de Souza da SilvaDesenvolvimento e Regras de NegócioAndré de Oliveira SacramentoDesenvolvimento e Testes💡 Objetivos de AprendizadoUI Declarativa: Construção de interfaces com Jetpack Compose e componentes do Material Design 3.Navegação Declarativa: Gerenciamento do fluxo de telas via Navigation Compose.Persistência Local: Armazenamento relacional simples usando Room Database.Arquitetura Reativa: Implementação da arquitetura MVVM com ViewModel, StateFlow e UiState.Programação Assíncrona: Manipulação de fluxos e dados em segundo plano com Kotlin Coroutines.[!WARNING]Aviso Importante sobre Segurança:Esta aplicação possui finalidade exclusivamente didática. As senhas são armazenadas em texto limpo (Plain Text), sem qualquer mecanismo de criptografia. Não utilize este aplicativo para salvar credenciais reais em ambientes de produção.🛠️ Stack TecnológicaTecnologiaBadgeDescriçãoKotlinLinguagem oficial para desenvolvimento AndroidJetpack ComposeToolkit declarativo para construção de interfaces gráficasMaterial Design 3Sistema de design atualizado do GoogleRoom DatabaseBiblioteca de abstração para o SQLiteNavigation ComposeBiblioteca para transição e rotas entre telasViewModelGerenciador do estado da interface durante mudanças de ciclo de vidaCoroutines & FlowConcorrência e reatividade assíncronaGradleAutomação e gestão de dependências2. Wiki — Home🔐 PlainText App — Documentação Oficial da WikiBem-vindo à Wiki do PlainText App, desenvolvido durante a capacitação DevTITANS Hands-On Android. Esta documentação contém todos os detalhes de arquitetura, configuração, camadas de dados, equipe e guia de contribuição.👥 Membros do ProjetoMurilo Rafael de AlcantaraAbel Freire de AndradeWicttory Leônidas Pontes da SilvaSergio Ademir Rocha do CarmoEmanuel Thiago de Souza da SilvaAndré de Oliveira Sacramento🗺️ Guia de Navegação InternaSeçãoPáginaDescrição🏗️Arquitetura e EstruturaMapeamento MVVM, padrão UDF e organização das pastas do repositório.🛠️Configuração do AmbienteInstruções de execução local, clonagem e uso dos scripts auxiliares.💾Camada de DadosModelagem de dados com Room, DAOs e o padrão Repository.🎨UI e NavegaçãoDesign com Jetpack Compose, componentes M3 e roteamento.⚙️ViewModel & CoroutinesGestão de estado reativo via StateFlow e concorrência assíncrona.📋Roteiro de ImplementaçãoOrdem recomendada das tarefas e checklist de entregáveis.⚠️Segurança & LimitaçõesDetalhamento sobre a ausência de criptografia e evoluções de produção.🤝Guia de Contribuição e EquipeIntegrantes do projeto, padrões de commits e fluxo de Pull Requests.3. Wiki — Arquitetura e Estrutura do Projeto🏛️ Padrão Arquitetural MVVMO projeto adota a arquitetura MVVM (Model-View-ViewModel) com um fluxo de dados unidirecional (Unidirectional Data Flow - UDF):  ┌────────────────────────────────────────────────────────┐
  │                        VIEW                            │
  │            (Jetpack Compose UI Screens)                │
  └──────────────────────────┬─────────────────────────────┘
                             │  Dispara Ações/Eventos (ex: onClick)
                             ▼
  ┌────────────────────────────────────────────────────────┐
  │                     VIEWMODEL                          │
  │             (StateFlow / UiState Holder)               │
  └──────────────────────────┬─────────────────────────────┘
                             │  Chama operações assíncronas (Coroutines)
                             ▼
  ┌────────────────────────────────────────────────────────┐
  │                    REPOSITORY                          │
  │        (Abstração da Origem dos Dados)                 │
  └──────────────────────────┬─────────────────────────────┘
                             │  Executa Queries
                             ▼
  ┌────────────────────────────────────────────────────────┐
  │                    ROOM DATABASE                       │
  │                  (SQLite Persistente)                  │
  └──────────────────────────┴─────────────────────────────┘
📂 Estrutura do RepositórioDevTITANS-Hands-On-Android/
├── jetcastersample/             # Projeto oficial de amostra do Google (referência de estudo)
├── PlainText/                   # Projeto principal do aplicativo
│   └── app/src/main/java/com/devtitans/plaintext/
│       ├── data/                # Entity, DAO, RoomDatabase e Repository
│       ├── ui/                  # Composables, Screens, Components e Theme
│       ├── navigation/          # NavHost, Rotas e Argumentos
│       └── viewmodel/           # ViewModels e definição de UiStates
├── install_android_studio.sh    # Script auxiliar para instalação da IDE no Linux
└── run_android_studio.sh        # Script auxiliar para execução da IDE
4. Wiki — Configuração do Ambiente📋 Requisitos do SistemaSistema Operacional: Linux (Ubuntu 20.04 ou superior recomendado), macOS ou Windows.JDK: Java Development Kit 17 ou superior.Android Studio: Versão Hedgehog ou mais recente.Git: Instalado e configurado na máquina.🚀 Passo a Passo de InstalaçãoClonar o Repositório:git clone https://github.com/Murillo-Rafael/DevTITANS-Hands-On-Android.git
cd DevTITANS-Hands-On-Android
Utilizar os Scripts Auxiliares (Linux):# Dar permissão de execução aos scripts
chmod +x install_android_studio.sh run_android_studio.sh

# Instalar o Android Studio (se necessário)
./install_android_studio.sh

# Executar a IDE
./run_android_studio.sh
Abrir o Projeto:No Android Studio, selecione Open.Navegue até o diretório DevTITANS-Hands-On-Android/PlainText e clique em OK.Aguarde o término do processo de sincronização das dependências do Gradle (Gradle Sync).Execução:Conecte um smartphone Android via cabo USB com a Depuração USB ativada ou inicie um dispositivo virtual (AVD Emulator).Clique no botão Run App (Shift + F10).5. Wiki — Camada de Dados (Room Database)A camada de dados é responsável pela persistência local das credenciais salvas no dispositivo.📄 Componentes Principais1. Entity (PasswordEntity.kt)Representa a tabela do banco de dados SQLite.@Entity(tableName = "passwords")
data class PasswordEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val title: String,
    val username: String,
    val passwordText: String, // Texto puro (Plain Text)
    val notes: String? = null
)
2. DAO (PasswordDao.kt)Define as operações de acesso aos dados com chamadas suspendíveis e reativas via Flow.@Dao
interface PasswordDao {
    @Query("SELECT * FROM passwords ORDER BY title ASC")
    fun getAllPasswords(): Flow<List<PasswordEntity>>

    @Query("SELECT * FROM passwords WHERE id = :id")
    suspend fun getPasswordById(id: Long): PasswordEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPassword(password: PasswordEntity)

    @Update
    suspend fun updatePassword(password: PasswordEntity)

    @Delete
    suspend fun deletePassword(password: PasswordEntity)
}
3. Database (AppDatabase.kt) & Repository (PasswordRepository.kt)O AppDatabase gerencia o SQLite e o PasswordRepository centraliza o fornecimento de dados para a camada de apresentação.6. Wiki — UI e Navegação (Compose & Material 3)🎨 Design System e EstilizaçãoA interface utiliza o Material Design 3, aproveitando esquemas de cores adaptativos e tipografia padronizada em ui/theme/.📺 Telas do AplicativoPasswordListScreen: Exibe a lista de senhas cadastradas através de um LazyColumn, permitindo filtrar e navegar para os detalhes ou formulário.PasswordDetailScreen: Apresenta as informações completas do registro selecionado (com opção de cópia e exclusão).PasswordFormScreen: Formulário reutilizável para Criação e Edição de credenciais.🧭 Navegação (AppNavigation.kt)As rotas são tratadas via NavHost com argumentos tipados:sealed class Screen(val route: String) {
    object List : Screen("password_list")
    object Form : Screen("password_form?passwordId={passwordId}") {
        fun createRoute(passwordId: Long? = null) = "password_form?passwordId=${passwordId ?: -1L}"
    }
    object Detail : Screen("password_detail/{passwordId}") {
        fun createRoute(passwordId: Long) = "password_detail/$passwordId"
    }
}
7. Wiki — Gerenciamento de Estado (ViewModel & Coroutines)⚡ Estrutura do UiStatePara representar o estado da interface gráfica de forma determinística, utiliza-se uma classe selada de estado:sealed interface PasswordUiState {
    object Loading : PasswordUiState
    data class Success(val passwords: List<PasswordEntity>) : PasswordUiState
    data class Error(val message: String) : PasswordUiState
}
⚙️ Responsabilidades do ViewModel (PasswordViewModel.kt)Expõe o estado da interface como um StateFlow<PasswordUiState>.Executa operações de leitura e gravação no banco dentro do escopo viewModelScope.Mantém o estado da tela preservado mesmo durante rotação de tela ou trocas de contexto.8. Wiki — Roteiro de Implementação e Tarefas📋 Etapas do DesenvolvimentoFase 1: Interface & Banco de Dados[x] Configurar o banco de dados Room (Entity, DAO e Database).[x] Desenhar a estrutura de navegação com NavHost.[x] Construir os componentes visuais reutilizáveis (Card, TextField, Dialogs).[x] Criar as telas PasswordListScreen, PasswordFormScreen e PasswordDetailScreen.Fase 2: Regras de Negócio & Integração[x] Desenvolver os ViewModels e mapear as ações do usuário.[x] Conectar o repositório do Room com o StateFlow do ViewModel.[x] Implementar funções CRUD completas (Inserir, Listar, Atualizar e Deletar).[x] Adicionar tratamentos de erro e estados de carregamento.9. Wiki — Segurança e Limitações⚠️ Vulnerabilidade do Texto Limpo (Plain Text)Por ser um aplicativo estritamente didático, os dados de usuários e senhas são armazenados em texto limpo. Isso significa que qualquer processo com acesso root ao sistema de arquivos do dispositivo consegue ler o arquivo de banco de dados SQLite sem barreiras.🛡️ Requisitos para Aplicação em ProduçãoCaso o aplicativo fosse disponibilizado para uso comercial ou pessoal, as seguintes camadas de segurança precisariam ser implementadas:SQLCipher: Criptografia completa da base de dados do Room em repouso.EncryptedSharedPreferences: Armazenamento seguro de chaves de acesso.Android KeyStore System: Armazenamento de chaves criptográficas em hardware dedicado (Keystore/TEE).BiometricPrompt API: Autenticação biométrica (Digital ou Reconhecimento Facial) para desbloqueio do app.10. Wiki — Guia de Contribuição e Equipe👥 Integrantes da EquipeMurilo Rafael de AlcantaraAbel Freire de AndradeWicttory Leônidas Pontes da SilvaSergio Ademir Rocha do CarmoEmanuel Thiago de Souza da SilvaAndré de Oliveira Sacramento🤝 Diretrizes para ColaboradoresBranches:Crie uma nova branch para cada funcionalidade ou correção:git checkout -b feature/nome-da-funcionalidade ou fix/corrigir-bug.Padrão de Commits (Conventional Commits):feat: Adição de uma nova funcionalidade.fix: Correção de um bug.docs: Alterações na documentação/Wiki.style: Formatação ou ajustes visuais sem alteração na lógica.refactor: Refatoração de código.Pull Requests (PRs):Abra o PR apontando para a branch principal (main ou developer).Adicione uma descrição sucinta das alterações realizadas.Solicite a revisão de pelo menos um colega de equipe antes do merge.
