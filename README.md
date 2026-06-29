# Doctor Management System - Spring Boot Backend

A Spring Boot-based backend application for managing doctors, patients, and appointments. The application utilizes Spring Data JPA for persistence and exposes REST APIs for database operations, with MySQL as the database provider.

---

## 🚀 Technology Stack

- **Java Version**: 17
- **Framework**: Spring Boot 4.1.0 (with Web & Data JPA Starters)
- **Database**: MySQL (using `mysql-connector-j` driver)
- **Build Automation**: Maven

---

## 🛠️ Setup & Installation

### 1. Prerequisites
- **JDK 17** installed and configured in your environment path.
- **MySQL Server** installed and running on `localhost:3306`.
- **Maven** (optional, as Maven Wrapper `mvnw` is included in the project).

### 2. Database Configuration
1. Log in to your MySQL terminal:
   ```sql
   mysql -u root -p
   ```
2. Create the database required by the application:
   ```sql
   CREATE DATABASE HospitalSpring;
   ```
3. The database properties are defined in `backend/src/main/resources/application.properties`:
   - **URL**: `jdbc:mysql://localhost:3306/HospitalSpring`
   - **Username**: `root`
   - **Password**: `satyamrana`
   - **DDL Mode**: `update` (Hibernate will automatically create/update the database schema tables upon application launch)

> [!NOTE]
> Update the username and password in [application.properties](file:///Users/satyamrana/Documents/Doctor%20Management%20System%20Spring%20Boot/backend/src/main/resources/application.properties) if your local MySQL configurations differ.

### 3. Running the Application
Navigate to the `backend` directory and start the application:

```bash
cd backend
./mvnw spring-boot:run
```

The application will launch by default on port `8080` (accessible at `http://localhost:8080`).

---

## 📋 Domain Models (Entities)

### 🩺 DoctorModel
Represents a medical practitioner.
- `id` (Long, Primary Key - Auto Generated)
- `name` (String) - Full name of the doctor
- `avatar` (String) - URL or path to the avatar image
- `speciality` (String) - Medical specialty (e.g., Cardiologist, Dermatologist)
- `edu` (String) - Educational credentials (e.g., MBBS, MD)
- `exp` (int) - Years of experience
- `fee` (int) - Consultation fee
- `successRate` (int) - Success rate percentage

### 👤 PatientModel
Represents a patient seeking consultation.
- `id` (Long, Primary Key - Auto Generated)
- `name` (String) - Full name of the patient
- `avatar` (String) - URL or path to the avatar image
- `gender` (String) - Patient's gender
- `age` (int) - Patient's age
- `symptoms` (String) - Symptoms described by the patient
- `desc` (String) - Detailed medical description/notes

### 📅 AppointmentModel
Links a patient and a doctor for a scheduled consultation.
- `id` (Long, Primary Key - Auto Generated)
- `date` (String) - Scheduled date of the appointment
- `time` (String) - Scheduled time slot of the appointment
- `status` (String) - Current status of the appointment (e.g., Scheduled, Completed, Pending)
- `patientId` (Long) - Reference ID of the patient
- `doctorId` (Long) - Reference ID of the doctor

---

## 🔌 API Endpoints

All controller endpoints are configured with `@CrossOrigin("*")` to support integration with frontend applications.

### 1. Doctor APIs

#### 🔹 Get Doctor List
- **Endpoint**: `GET /api/doctors/list`
- **Description**: Returns all registered doctors.
- **Response Format**: `application/json`

#### 🔹 Add Doctor
- **Endpoint**: `POST /api/doctors/add`
- **Description**: Adds a new doctor to the database.
- **Request Body Example**:
  ```json
  {
    "name": "Dr. Sarah Smith",
    "avatar": "https://example.com/avatars/dr-sarah.png",
    "speciality": "Cardiologist",
    "edu": "MD, FACC",
    "exp": 12,
    "fee": 150,
    "successRate": 98
  }
  ```

---

### 2. Patient APIs

#### 🔹 Get Patient List
- **Endpoint**: `GET /api/Patients/list`
- **Description**: Returns all registered patients.
- **Response Format**: `application/json`

#### 🔹 Add Patient
- **Endpoint**: `POST /api/Patients/add`
- **Description**: Adds a new patient record.
- **Request Body Example**:
  ```json
  {
    "name": "John Doe",
    "avatar": "https://example.com/avatars/john-doe.png",
    "gender": "Male",
    "age": 34,
    "symptoms": "Chest pain and fatigue",
    "desc": "Prior history of hypertension."
  }
  ```

---

### 3. Appointment APIs

#### 🔹 Get Appointment List
- **Endpoint**: `GET /api/appointments/list`
- **Description**: Returns all scheduled appointments.
- **Response Format**: `application/json`

#### 🔹 Create Appointment
- **Endpoint**: `POST /api/appointments/add`
- **Description**: Schedules a new appointment between a doctor and a patient.
- **Request Body Example**:
  ```json
  {
    "date": "2026-07-15",
    "time": "10:30 AM",
    "status": "Scheduled",
    "patientId": 1,
    "doctorId": 2
  }
  ```
