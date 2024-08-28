# 💳 Sistema Bancário - API Restful com Spring Boot

Este projeto é uma simulação de um sistema bancário, desenvolvido em Java utilizando Spring Boot, com foco no back-end e testado via Postman. A aplicação contempla funcionalidades para gerenciamento de clientes, contas, cartões de crédito, empréstimos e transações bancárias.

## 🛠️ Funcionalidades

### 1. 👤 Funcionalidades Relacionadas ao Cliente
- **Cadastro de Cliente**: Endpoint para cadastrar novos clientes no sistema.
- **Atualização de Dados**: API para atualizar informações cadastrais dos clientes, como endereço e telefone.
- **Consulta de Informações**: Endpoint para consultar os dados de um cliente específico.

### 2. 🧑‍💼 Funcionalidades Relacionadas ao Gerente
- **Aprovação de Empréstimos**: API para que o gerente possa aprovar ou rejeitar solicitações de empréstimo dos clientes.
- **Atribuição Automática de Clientes**: Lógica para atribuir automaticamente o gerente com menos clientes ao criar um novo cliente.

### 3. 🏦 Funcionalidades Relacionadas à Conta
- **Criação de Conta**: Endpoint para criar novas contas associadas a um cliente e gerente.
- **💵 Depósito**: API para realizar depósitos na conta de um cliente.
- **💳 Saque**: Endpoint para realizar saques, com validação de saldo disponível.
- **💸 Transferência**: API para transferir dinheiro entre contas, com validação de saldo e aplicação de possíveis taxas.
- **📊 Consulta de Saldo**: Endpoint para verificar o saldo disponível de uma conta.
- **📜 Histórico de Transações**: API para consultar o histórico de transações da conta (saques, depósitos, transferências).

### 4. 💳 Funcionalidades Relacionadas ao Cartão de Crédito
- **Criação de Cartão de Crédito**: Endpoint para criação de cartões de crédito associados a uma conta, com limites definidos.
- **🛒 Validação de Limite**: API para validar se o cartão de crédito tem limite disponível para uma compra.
- **📅 Verificação de Validade do Cartão**: Endpoint para verificar se o cartão de crédito está expirado.
- **📄 Consulta de Fatura**: API para consultar a fatura do cartão de crédito, listando todas as compras e o valor total a ser pago.

### 5. 💰 Funcionalidades Relacionadas ao Empréstimo
- **Solicitação de Empréstimo**: API para que clientes possam solicitar empréstimos.
- **📈 Simulação de Parcelas**: Endpoint para simular o valor das parcelas de um empréstimo com base no valor solicitado e nas taxas de juros aplicáveis.
- **🔍 Consulta de Status do Empréstimo**: API para clientes consultarem o status de suas solicitações de empréstimo (em análise, aprovado, rejeitado).

### 6. 💳 Funcionalidades Relacionadas às Transações
- **💡 Pagamento de Contas**: API para realizar o pagamento de contas, deduzindo o valor do saldo da conta ou adicionando à fatura do cartão de crédito.

## 🚀 Funcionalidades Futuras
### 1. 📈 Funcionalidades Relacionadas a Investimentos
- **Conta de Investimento**: Criar e gerenciar contas de investimento separadas da conta corrente.
- **📊 Simulador de Rentabilidade de Investimento**: Endpoint para simular a rentabilidade de diferentes tipos de investimentos com base em dados reais de mercado.
- **📈 Valorização de Investimento**: API para consultar a valorização de investimentos em tempo real, utilizando dados de mercado financeiro.
- **💸 Transferência de Saldo entre Contas**: Permitir a transferência de saldo entre a conta de investimento e a conta corrente.
- **💰 Simulação de Pagamentos de Dividendos**: Criar uma funcionalidade para simular o pagamento de dividendos aos clientes com base em seus investimentos.

---

Essas **Funcionalidades Futuras** trarão uma camada adicional de complexidade e valor ao projeto, focando na simulação de investimentos e operações financeiras mais avançadas.
