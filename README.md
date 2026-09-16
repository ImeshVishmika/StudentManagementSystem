# Student Management System

A desktop GUI application for managing students, teachers, subjects, and class schedules in an educational institution. Built as a Software Architecture and Design (SAD) assignment project.

## Tech Stack

| Component       | Technology                                  |
|-----------------|---------------------------------------------|
| Language        | Java (JDK 17+)                             |
| GUI Framework   | Java Swing                                 |
| UI Theme        | [FlatLaf 3.6](https://www.formdev.com/flatlaf/) |
| Database        | MySQL 8.x (JDBC)                           |
| Build System    | Apache Ant (NetBeans)                      |
| IDE             | Apache NetBeans (recommended)              |

## Features

- **Login System** -- Username/password authentication against a MySQL database
- **Dashboard** -- Summary cards showing counts of students, teachers, and subjects
- **Student Management** -- Register, search, list, and delete students
- **Teacher Management** -- Register, search, list, and delete teachers
- **Subject Management** -- Add, search, list, and delete subjects
- **Schedule Management** -- Create, view, and manage class schedules
- **Card Layout Navigation** -- Sidebar navigation switching between panels within a single frame

## Prerequisites

- **Java JDK 17+**
- **Apache NetBeans** or **Apache Ant**
- **MySQL Server** running on `127.0.0.1:3306`

## Database Setup

1. Create a MySQL database named `students_db`
2. Create the following tables:

| Table                      | Key Columns                                                     |
|----------------------------|-----------------------------------------------------------------|
| `user`                     | `userName`, `password`                                          |
| `student`                  | `NIC`, `firstName`, `lastName`, `email`, `genderID`             |
| `teachers`                 | `TNIC`, `firstName`, `lastName`, `Temail`, `genderID`           |
| `subject`                  | `id`, `subjectName`                                             |
| `grade`                    | `gradeNo`, `gradeName`                                          |
| `student_enrollment`       | `student_NIC`, `teachersSubID`                                  |
| `teachers_has_subjects`    | `teacher`, `subject`                                            |
| `subjects_in_grades`       | `gradeSubID`, `subjectID`, `grade`                              |
| `schedule`                 | `schedule_id`, `title`, `grade`, `subject`, `teacherId`, `date`, `startTime`, `endTime` |

3. Update database credentials in `src/connection/DB.java`:
   - `URL` -- JDBC connection URL (default: `jdbc:mysql://127.0.0.1:3306/students_db`)
   - `USER` -- MySQL username (default: `root`)
   - `PASSWORD` -- MySQL password

4. Insert a record into the `user` table for login authentication.

## How to Run

### Option A: Run via NetBeans (Recommended)

1. Open the project in Apache NetBeans
2. Right-click the project and select **Run** (or press `F6`)

### Option B: Run the pre-built JAR

```bash
cd dist
java -jar StudentManagmentSystem.jar
```

### Option C: Build from source with Ant

```bash
ant clean
ant jar
java -jar dist/StudentManagmentSystem.jar
```

## Project Structure

```
StudentManagementSystem/
├── src/
│   ├── connection/       # Database connection (DB.java)
│   ├── dto/              # Data Transfer Objects (Student, Teacher, Subject, Schedule)
│   ├── gui/              # Swing JFrames (Login, Home, Registration forms)
│   ├── model/            # Data access layer (CRUD operations)
│   ├── panel/            # Swing JPanels (Dashboard, list views)
│   └── icon/             # SVG icon resources
├── lib/                  # External JAR libraries
│   ├── flatlaf-3.6.jar
│   ├── flatlaf-extras-3.6.jar
│   ├── jcalendar-1.4.jar
│   ├── jsvg-1.4.0.jar
│   └── mysql-connector-j-8.0.33.jar
├── test/                 # Test sources (empty)
├── dist/                 # Pre-built JAR and libraries
├── build.xml             # Ant build file
└── nbproject/            # NetBeans project configuration
```

## Dependencies

| Library             | Version | Purpose                              |
|---------------------|---------|--------------------------------------|
| FlatLaf             | 3.6     | Modern flat Look and Feel for Swing  |
| FlatLaf Extras      | 3.6     | SVG icon support                     |
| JCalendar           | 1.4     | Date picker component                |
| JSVG                | 1.4.0   | SVG rendering engine                 |
| MySQL Connector/J   | 8.0.33  | JDBC driver for MySQL                |

## License

This project was developed as an academic assignment.
