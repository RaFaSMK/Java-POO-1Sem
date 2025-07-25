### 🤝Back-end de uma plataforma de Match Profissional para PCDs – Java Spring Boot

Este projeto é uma plataforma de conexão entre candidatos PCDs e empresas, inspirada no modelo de "LinkedIn em formato Tinder", onde ambas as partes dão "match" com base em compatibilidade de perfis. O sistema utiliza um questionário de acessibilidade com base no Instrumento de Funcionalidade Brasileiro (IF-Br) para avaliar os candidatos, promovendo a inclusão e a acessibilidade no processo de recrutamento.

O projeto foi idealizado a partir de uma proposta do Instituto IBDP com foco em empregabilidade e acessibilidade para pessoas com deficiência.

### 📁 Estrutura do Projeto

```
├── controller/         # Controladores REST (API)
├── model/              # Entidades JPA
├── repository/         # Interfaces de acesso ao banco (JPA Repositories)
├── service/            # Regras de negócio
└── BdRestfulApplication.java  # Classe principal da aplicação Spring Boot
```

---

### 🚀 Funcionalidades
*	📋 Cadastro de Candidatos PCD com base no questionário IF-Br.
*	🏢 Cadastro de empresas e perfis de vagas (em expansão).
*	❓ Questionários temáticos (IF-Br) para análise de perfil funcional do candidato.
*	💬 Sistema de match entre empresas e candidatos com base em compatibilidade.
*	♿ Foco em acessibilidade digital e inclusão.
*	🔎 CRUD completo para entidades como: Candidato, Formulário, Questão, Questionário, Domínio e Resposta.

---

### 🛠️ Tecnologias Utilizadas

* Java 11+
* Spring Boot
* Spring Data JPA
* REST APIs
* Hibernate
* (Presumivelmente) banco de dados relacional (como H2, PostgreSQL ou MySQL)

---

### 📬 Endpoints REST

Cada entidade possui seu respectivo controlador REST. Exemplos de endpoints esperados:

* `GET /candidatos`
* `POST /dominios`
* `GET /formularios/{id}`
* `POST /questoes`
* `PUT /questionarios/{id}`
---

### 👨‍💻 Autor

Projeto acadêmico desenvolvido por Rafael Souza (https://github.com/RaFaSMK) em conjunto com o Docente Daniel Pires, durante o 3º semestre do curso de Engenharia de Software.

📄 [Relatório Final do Projeto](RELATÓRIO-FINAL-UCE-PP1.pdf)
