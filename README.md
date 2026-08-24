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

🔐 PlainText App — Documentação Completa do Projeto📌 Índice Geral da Documentação

📱 Sobre o Projeto

O PlainText App é um gerenciador de senhas simples e didático desenvolvido no âmbito do programa DevTITANS Hands-On Android. 
O seu propósito principal é servir como uma aplicação de estudo prático para consolidar os fundamentos e ferramentas do desenvolvimento Android nativo moderno.

### 👥 Equipe de Desenvolvimento

| **Nome do Integrante** | **Papel / Responsabilidades** |
| :--- | :--- |
| **Murilo Rafael de Alcantara** |  | Desenvolvimento e Persistência de Dados |
| **Abel Freire de Andrade** | Desenvolvimento e Arquitetura |
| **Wicttory Leônidas Pontes da Silva** | Desenvolvimento UI/UX |
| **Sergio Ademir Rocha do Carmo** | Desenvolvimento e Documentação 
| **Emanuel Thiago de Souza da Silva** | Desenvolvimento e Regras de Negócio |
| **André de Oliveira Sacramento** | Desenvolvimento e Testes |


💡 Objetivos de Aprendizado

* **UI Declarativa:** Construção de interfaces com **Jetpack Compose** e componentes do **Material Design 3**.
* **Navegação Declarativa:** Gerenciamento do fluxo de telas via **Navigation Compose**.
* **Persistência Local:** Armazenamento relacional simples usando **Room Database**.
* **Arquitetura Reativa:** Implementação da arquitetura **MVVM** com **ViewModel**, **StateFlow** e **UiState**.
* **Programação Assíncrona:** Manipulação de fluxos e dados em segundo plano com **Kotlin Coroutines**.
* 

> [!WARNING] **Aviso Importante sobre Segurança:**
>
> Esta aplicação possui finalidade **exclusivamente didática**. As senhas são armazenadas em **texto limpo (Plain Text)**, sem qualquer mecanismo de criptografia. **Não utilize este aplicativo para salvar credenciais reais em ambientes de produção.**


### 🛠️ Stack Tecnológica

| **Tecnologia** | **Badge** | **Descrição** | 
| :--- | :---: | :--- |
| **Kotlin** | ![Kotlin](https://img.shields.io/badge/-Kotlin-7F52FF?style=flat-square&logo=kotlin&logoColor=white) | Linguagem oficial para desenvolvimento Android | 
| **Jetpack Compose** | ![Compose](https://img.shields.io/badge/-Compose-4285F4?style=flat-square&logo=jetpackcompose&logoColor=white) | Toolkit declarativo para construção de interfaces gráficas | 
| **Material Design 3** | ![MD3](https://img.shields.io/badge/-Material%203-757575?style=flat-square&logo=materialdesign&logoColor=white) | Sistema de design atualizado do Google | 
| **Room Database** | ![Room](https://img.shields.io/badge/-Room-FF6F00?style=flat-square&logo=android&logoColor=white) | Biblioteca de abstração para o SQLite | 
| **Navigation Compose** | ![Nav](https://img.shields.io/badge/-Navigation-4285F4?style=flat-square&logo=android&logoColor=white) | Biblioteca para transição e rotas entre telas | 
| **ViewModel** | ![VM](https://img.shields.io/badge/-ViewModel-34A853?style=flat-square&logo=android&logoColor=white) | Gerenciador do estado da interface durante mudanças de ciclo de vida | 
| **Coroutines & Flow** | ![Coroutines](https://img.shields.io/badge/-Coroutines-7F52FF?style=flat-square&logo=kotlin&logoColor=white) | Concorrência e reatividade assíncrona | 
| **Gradle** | ![Gradle](https://img.shields.io/badge/-Gradle-02303A?style=flat-square&logo=gradle&logoColor=white) | Automação e gestão de dependências |


### 🏛️ Padrão Arquitetural MVVM

O projeto adota a arquitetura **MVVM (Model-View-ViewModel)** com um fluxo de dados unidirecional (**Unidirectional Data Flow - UDF**):

┌────────────────────────────────────────────────────────┐
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


### 📂 Estrutura do Repositório

DevTITANS-Hands-On-Android/
├── jetcastersample/             # Projeto oficial de amostra do Google (referência de estudo)
├── PlainText/                   # Projeto principal do aplicativo
│   └── app/src/main/java/com/devtitans/plaintext/
│       ├── data/                # Entity, DAO, RoomDatabase e Repository
│       ├── ui/                  # Composables, Screens, Components e Theme
│       ├── navigation/          # NavHost, Rotas e Argumentos
│       └── viewmodel/           # ViewModels e definição de UiStates
├── install_android_studio.sh    # Script auxiliar para instalação da IDE no Linux
└── run_android_studio.sh        # Script auxiliar para execução da IDE

## 4. Configuração do Ambiente

### 📋 Requisitos do Sistema

* **Sistema Operacional:** Linux (Ubuntu 20.04 ou superior recomendado), macOS ou Windows.
* **JDK:** Java Development Kit 17 ou superior.
* **Android Studio:** Versão Hedgehog ou mais recente.
* **Git:** Instalado e configurado na máquina.

### 🚀 Passo a Passo de Instalação

1. **Clonar o Repositório:**
   
```bash
   git clone [https://github.com/Murillo-Rafael/DevTITANS-Hands-On-Android.git](https://github.com/Murillo-Rafael/DevTITANS-Hands-On-Android.git)
   cd DevTITANS-Hands-On-Android
    # Utilizar os Scripts Auxiliares (Linux):

Bash
   # Dar permissão de execução aos scripts
   chmod +x install_android_studio.sh run_android_studio.sh
   # Instalar o Android Studio (se necessário)
   ./install_android_studio.sh
   # Executar a IDE
   ./run_android_studio.sh
   # Abrir o Projeto:
        No Android Studio, selecione Open.
        Navegue até o diretório DevTITANS-Hands-On-Android/PlainText e clique em OK.
        Aguarde o término do processo de sincronização das dependências do Gradle (Gradle Sync).
    # Execução:
        Conecte um smartphone Android via cabo USB com a Depuração USB ativada ou inicie um dispositivo virtual (AVD Emulator).
        Clique no botão Run App (Shift + F10).
    # Camada de Dados (Room Database)
       A camada de dados é responsável pela persistência local das credenciais salvas no dispositivo.

    📄 Componentes Principais

     # 1. Entity (`PasswordEntity.kt`)
       Representa a tabela do banco de dados SQLite.

   ```kotlin
   @Entity(tableName = "passwords")
   data class PasswordEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val title: String,
    val username: String,
    val passwordText: String, // Texto puro (Plain Text)
    val notes: String? = null
 )
  2. ** DAO (PasswordDao.kt) **

  Define as operações de acesso aos dados com chamadas suspendíveis e reativas via Flow.
  Kotlin

 @Dao
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


## 6. UI e Navegação (Compose & Material 3)

### 🎨 Design System e Estilização

A interface utiliza o **Material Design 3**, aproveitando esquemas de cores adaptativos e tipografia padronizada em `ui/theme/`.

### 📺 Telas do Aplicativo

1. **PasswordListScreen:** Exibe a lista de senhas cadastradas através de um `LazyColumn`, permitindo filtrar e navegar para os detalhes ou formulário.

2. **PasswordDetailScreen:** Apresenta as informações completas do registro selecionado (com opção de cópia e exclusão).

3. **PasswordFormScreen:** Formulário reutilizável para **Criação** e **Edição** de credenciais.

### 🧭 Navegação (`AppNavigation.kt`)

As rotas são tratadas via `NavHost` com argumentos tipados:

```kotlin
sealed class Screen(val route: String) {
    object List : Screen("password_list")
    object Form : Screen("password_form?passwordId={passwordId}") {
        fun createRoute(passwordId: Long? = null) = "password_form?passwordId=${passwordId ?: -1L}"
    }
    object Detail : Screen("password_detail/{passwordId}") {
        fun createRoute(passwordId: Long) = "password_detail/$passwordId"
    }
}
