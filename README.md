# Phone Store

The Phone Store project consists of three main components:

- **Frontend for End Users:** This frontend allows end-users to browse, purchase, and view information about available mobile phones.

- **Admin Frontend:** The admin frontend is designed for administrators to manage products and data in the backend system.

- **Backend:** The backend of the project serves as the API layer and manages databases and other essential functionalities.

## Technologies used

- **Frontend:** Both frontends (for end-users and admins) are developed using Angular.
- **Backend:** The backend is built using Spring Boot Java with MongoDB.

## Installation

To set up and run the Phone Store project, follow these steps:

1. Clone the repository to your local machine.
2. Install the required dependencies for the frontends.
    - For the Angular frontends, navigate to the frontend directories and run:

      ```
      npm install
      ```
  
4. Configure the necessary environment variables, database connections, and any other project-specific configurations.
5. Use Docker Compose to set up the MongoDB database:

    - Make sure you have Docker and Docker Compose installed.
    - Navigate to the project's root directory.
    - Run the following command to start MongoDB using Docker Compose:

      ```
      docker-compose up -d
      ```

6. Start the frontend and backend components according to their respective setup instructions.
7. Access the application through your web browser or API client.

## Usage

- Use the end-user frontend to explore and shop for mobile phones.
- Access the admin frontend to manage product data and perform administrative tasks.
- Utilize the backend API to interact programmatically with the system.

## License

This project is open-source and is licensed unter the MIT License.

---

Thank you for considering the Phone Store project. Please note that contributions are not currently accepted until the project is completed. If you have any questions or need assistance, feel free to reach out to me.
