# BankingApp-JavaConsole
📦 Java console app for managing bank accounts using packages, custom exceptions &amp; validations. Supports Saving, Current, Loan &amp; FD accounts. Includes deposit, withdraw, transfer, sort (by number/date), and LocalDate-based tracking. Implements Comparable &amp; Comparator.# 🏦 BankingApp-JavaConsole

A console-based Java application to simulate basic banking operations such as account creation, fund transfers, and account management. Designed using object-oriented principles with modular packages for better organization and maintainability.

---

## 📁 Project Structure

- `core` – Contains core entities like `BankAccount` and `AccountType`.
- `operations` – Interfaces and implementation of banking operations.
- `ui` – User interface layer with the main method.
- `validations` – Input validation logic.
- `custom_exceptions` – User-defined exception classes.

---

## 🧾 Supported Account Types

- Saving
- Current
- Loan
- Fixed Deposit (FD)

---

## 💡 Features

- ✅ Create new bank accounts with input validations
- 📄 View account summaries
- 💰 Deposit and withdraw funds
- 🔁 Transfer funds between accounts
- ❌ Close accounts
- 📊 Sort accounts by:
  - Account number (ascending)
  - Date and balance (custom comparator)
- 📆 Uses `LocalDate` for managing opening dates
- 🔐 Custom exception handling for better error reporting

---

## 📌 Technologies Used

- Java 8
- OOP Principles
- Custom Exceptions
- `LocalDate` API
- Comparable & Comparator interfaces

---

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/ShaziyaHussain/BankingApp-JavaConsole.git

