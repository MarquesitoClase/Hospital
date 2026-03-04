# 🏥 Hospital

Proyecto desarrollado en **Java (Vanilla)** utilizando **Maven** como gestor de dependencias.

El objetivo del proyecto es modelar la gestión básica de un hospital mediante clases y pruebas unitarias.

---

## 📁 Estructura del proyecto

```
Hospital/
├── .idea/
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/
│   │   │       └── example/
│   │   │           └── personalhospital/
│   │   │               ├── Characters.java(abstract)
│   │   │               ├── DoctorsInterface.java
│   │   │               ├── Especialist.java
│   │   │               ├── Pacient.java
│   │   │               ├── PacientAmbulancia.java
│   │   │               ├── PacienteAmbulanciaInterface.java
│   │   │               ├── PacienteConsultaInterface.java
│   │   │               ├── PacientsInterface.java
│   │   │               ├── StudiantMedical.java
│   │   │               └── Main.java
│   │   └── resources/
│   └── test/
│       └── java/
│           ├── MedicalTest.java
│           └── StudentMedicalTest.java
├── target/
├── .gitignore
├── pom.xml
└── README.md
```

---

## ⚙️ Tecnologías utilizadas

- Java
- Maven
- JUnit (para pruebas unitarias)

---

## 🧪 Testing

El proyecto incluye pruebas unitarias ubicadas en:

```
src/test/java
```

Para ejecutar los tests:

```bash
mvn test
```
---

## 📌 Notas

Proyecto realizado con fines formativos.