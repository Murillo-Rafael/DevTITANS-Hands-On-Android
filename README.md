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

## 📱 Sobre o Projeto

O **PlainText** é uma aplicação Android de gerenciamento de senhas desenvolvida como **Hands-On**.  
O objetivo é praticar os principais conceitos modernos do desenvolvimento Android:

- UI declarativa com **Jetpack Compose**
- Navegação com **Navigation Compose**
- Persistência local com **Room Database**
- Arquitetura com **ViewModel** + **StateFlow**
- Programação assíncrona com **Kotlin Coroutines**

> ⚠️ **Atenção:** Esta é uma aplicação de estudo. As senhas são armazenadas em **texto simples (Plain Text)** — **não utilize em produção**.

---

## 🗂️ Estrutura do Repositório

| Pasta / Arquivo              | Descrição                                                |
|------------------------------|----------------------------------------------------------|
| `jetcastersample/`           | Aplicação de exemplo oficial da Google (Jetpack Compose) |
| `PlainText/`                 | Projeto base que a equipe deve finalizar                 |
| `install_android_studio.sh`  | Script para baixar a versão mais recente do Android Studio |
| `run_android_studio.sh`      | Script para executar o Android Studio baixado            |

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia              | Badge                                                                                          | Descrição                          |
|-------------------------|------------------------------------------------------------------------------------------------|------------------------------------|
| **Kotlin**              | ![Kotlin](https://img.shields.io/badge/-Kotlin-7F52FF?logo=kotlin&logoColor=white)             | Linguagem principal                |
| **Jetpack Compose**     | ![Compose](https://img.shields.io/badge/-Compose-4285F4?logo=jetpackcompose&logoColor=white)   | UI Toolkit moderno                 |
| **Material Design 3**   | ![MD3](https://img.shields.io/badge/-Material%203-757575?logo=materialdesign&logoColor=white)  | Design System                      |
| **Room**                | ![Room](https://img.shields.io/badge/-Room-FF6F00?logo=android&logoColor=white)                | Persistência de dados              |
| **Navigation Compose**  | ![Nav](https://img.shields.io/badge/-Navigation-4285F4?logo=android&logoColor=white)           | Navegação entre telas              |
| **ViewModel**           | ![VM](https://img.shields.io/badge/-ViewModel-34A853?logo=android&logoColor=white)             | Gerenciamento de estado            |
| **Kotlin Coroutines**   | ![Coroutines](https://img.shields.io/badge/-Coroutines-7F52FF?logo=kotlin&logoColor=white)     | Programação assíncrona             |
| **Gradle**              | ![Gradle](https://img.shields.io/badge/-Gradle-02303A?logo=gradle&logoColor=white)             | Sistema de build                   |

---

## 📋 Sugestão de Divisão de Tarefas

Recomendamos a seguinte ordem de implementação:

### 1️⃣ Telas (Compose) + Navegação + Banco de Dados
- Criar as telas principais com **Jetpack Compose**
- Configurar a navegação entre as telas (**Navigation Compose**)
- Implementar o **Room Database** (Entity, Dao, Database)

### 2️⃣ ViewModels (por último)
- Criar os **ViewModels**
- Conectar a UI ao repositório / banco de dados
- Gerenciar estados com `StateFlow` / `UiState`

---

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone <url-do-repositorio>
   cd <nome-do-repositorio>
   ```

2. (Opcional) Instale o Android Studio com o script:
   ```bash
   ./install_android_studio.sh
   ```

3. Abra o projeto `PlainText/` no Android Studio

4. Sincronize o Gradle e execute o app em um emulador ou dispositivo físico

---

## 📂 Estrutura Sugerida do App (`PlainText/`)

```
PlainText/
├── app/
│   └── src/main/java/.../
│       ├── data/               # Room (Entity, Dao, Database, Repository)
│       ├── ui/
│       │   ├── screens/        # Telas Compose
│       │   ├── components/     # Componentes reutilizáveis
│       │   └── theme/          # Cores, Tipografia, Theme
│       ├── navigation/         # NavHost e rotas
│       └── viewmodel/          # ViewModels
└── ...
```

---

## ✨ Funcionalidades Esperadas

- [ ] Listar senhas salvas
- [ ] Adicionar nova senha (título, usuário, senha, notas)
- [ ] Editar senha existente
- [ ] Excluir senha
- [ ] Tela de detalhes
- [ ] Busca / filtro (opcional)

---

## 📄 Licença

Este projeto é destinado **apenas para fins educacionais** (Hands-On).

---
