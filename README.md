# 💰 Simple Bank Account System (Java)

Este projeto consiste em um sistema simples de conta bancária implementado em Java. Ele foi desenvolvido com foco em práticas básicas de Programação Orientada a Objetos (POO), como encapsulamento, validação e sobrescrita de métodos.

---

## 📁 Estrutura do Projeto

```
src/
├── entities/
│   └── Account.java
└── Main.java
```

---

## ✔️ Account.java

A classe `Account` representa uma conta bancária simples com os seguintes campos privados:

- `holder` (final): nome do titular da conta.
- `number` (final): número da conta.
- `balance`: saldo da conta.

### Funcionalidades implementadas:

- Construtores sobrecarregados para permitir criar contas com ou sem depósito inicial.
- Método `deposit(double)` que adiciona saldo à conta se o valor for positivo.
- Método `withdraw(double)` que subtrai do saldo o valor do saque mais uma taxa de $5, com validação de saldo suficiente.
- Sobrescrita de `toString()` para exibir os dados da conta de forma formatada.

Essa classe encapsula as regras de negócio básicas e impede que valores inválidos sejam inseridos diretamente.

---

## ✔️ Main.java

A classe `Main` é responsável por interagir com o usuário via terminal:

- Solicita o número e nome do titular da conta.
- Pergunta se haverá depósito inicial.
- Cria a instância da classe `Account` com base na escolha do usuário.
- Permite realizar um novo depósito.
- Permite realizar um saque.
- Mostra os dados da conta atualizados após cada operação.

Utiliza `Scanner` para entrada de dados e imprime o estado da conta usando o método `toString()` da classe `Account`.

---

## ✅ Requisitos

- Java 11 ou superior
- Terminal ou IDE (ex: IntelliJ, Eclipse)

---

## 🚀 Como executar

1. Compile os arquivos:
```bash
javac entities/Account.java Main.java
```

2. Execute a aplicação:
```bash
java Main
```

---

## 🧠 Conceitos aplicados

- Encapsulamento
- Construtores sobrecarregados
- Validação de entrada
- Sobrescrita de métodos
- Responsabilidade única

---

## 📌 Observações

Este projeto é apenas um exemplo introdutório e pode ser expandido com funcionalidades como:
- Transferência entre contas
- Registro de extrato
- Armazenamento em banco de dados
- Interface gráfica (GUI)

