# User-Information-Management-System.

## Overview
This project demonstrates a simple web application for inserting user details into a database using HTML, JSP, and a Java Bean. It includes an HTML form for collecting user information, a JSP page to process form submissions, and a Java Bean to interact with the database.

## Table of Contents

- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Project Structure

The project is divided into three parts:

1. HTML Form (`insert.html`):
   - A web form that collects user details, including first name, last name, gender, and email.
   - Styled with a cyan background.

2. JSP Processing (`insert.jsp`):
   - A JSP page that processes form submissions.
   - Uses a Java Bean (`SignBean`) to store user data in a database.
   - Provides feedback to the user on successful or unsuccessful record insertion.

3. Java Bean (`SignBean.java`):
   - A Java Bean class (`SignBean`) responsible for connecting to the database and performing the insert operation.
   - Stores user data in an Oracle database.

## Technologies Used

- HTML
- JavaServer Pages (JSP)
- Java Bean
- Oracle Database
- Java JDBC

## Getting Started

### Prerequisites

Before you begin, ensure you have the following:

- An Oracle Database instance
- Java Development Kit (JDK) installed
- An Integrated Development Environment (IDE) for Java (e.g., Eclipse, IntelliJ IDEA, EditPlus)

### Installation

1. Clone the repository:

   ```sh
   git clone https://github.com/your-username/your-repo.git
   ```

2. Open the project in your Java IDE.

3. Configure your database connection in `SignBean.java` by modifying the connection URL, username, and password.

4. Build and run the project.

## Usage

1. Access the HTML form at `http://localhost:8080/your-web-app/insert.html`.

2. Fill in the form with user details and submit.

3. The JSP page (`insert. jsp`) will process the form submission and attempt to insert the data into the database.

4. Check the feedback message on the JSP page to see if the record was successfully inserted.

## Contributing

Contributions are welcome! Here's how you can contribute:

- Fork the repository.
- Create a new branch for your changes: `git checkout -b feature/new-feature
- Make your changes and commit them: `git commit -m 'Add new feature'`
- Push your changes to your fork: `git push origin feature/new-feature
- Create a pull request to merge your changes into the main repository.

## License

This project is licensed under the [MIT License](LICENSE).

## Contact

For questions or feedback, please contact [Nayab Sunanda ](nayabsunanda@email.com).
