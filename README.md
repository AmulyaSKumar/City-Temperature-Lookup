# City Temperature Lookup

## Introduction
The **City Temperature Lookup and Weather Navigation** application allows users to view the minimum and maximum temperatures of different cities. The application is built with a **React** frontend and a **Spring Boot** backend. Users can select a city from a dropdown, fetch the temperature data, and navigate to Google’s live weather report for more detailed forecasts.

## Features
- Select a city and view its minimum and maximum temperatures.
- Search temperature data fetched from a backend file.
- Navigate to Google’s weather page for real-time forecasts of the selected city.

## Technologies Used
- **React**: A JavaScript library used for building user interfaces, managing the frontend, and handling user interactions.
- **Spring Boot**: A Java framework used for building the backend RESTful APIs and handling temperature data fetching.
- **File Storage**: Stores city, minimum temperature, and maximum temperature data, which is used by the backend.

## Objectives
1. Fetch city temperature data from a file using Spring Boot and expose it via a RESTful API.
2. Create a user-friendly frontend using React to display temperature information.
3. Provide real-time weather updates by integrating Google’s weather forecast.
4. Enable seamless navigation to Google’s weather page for more details on a selected city's weather.

## Prerequisites

- **Eclipse IDE**: For backend development. Install the **Spring Tool Suite (STS)** or configure the **Spring Boot** plugin in Eclipse.
- **Java 11 or above**: Required for running the Spring Boot application.
- **Node.js and npm**: Required for managing and running the React frontend.
- **zBoss Plugin for Eclipse**: Must be installed in Eclipse for debugging and running the Spring Boot backend.
- **VS Code**: For React frontend development.

## Architecture
The application follows a **client-server architecture**:
- **Frontend (React)**: Provides the user interface with a dropdown for city selection and buttons for temperature lookup and Google weather navigation.
- **Backend (Spring Boot)**: Serves the city temperature data from a file via REST API endpoints. The backend processes user requests and returns temperature data in JSON format.

### Backend (Spring Boot)
- Reads temperature data (city, minimum temperature, maximum temperature) from a file.
- Exposes an API to retrieve temperature data for a specific city based on the user selection.

### Frontend (React)
- Dropdown menu for selecting a city.
- Displays the minimum and maximum temperatures after searching.
- Button to navigate to Google’s live weather report for the selected city.

### Integration
- The React frontend interacts with the Spring Boot backend through HTTP requests.
- A GET request is made to fetch city temperature data from the backend.
- Upon receiving the data, the frontend displays it and provides the option to navigate to Google's weather page.

## System Architecture Diagram
The application’s architecture consists of a **React frontend** sending requests to a **Spring Boot backend**, which reads from a file and returns JSON responses.

## Functionality
1. **Data Fetching**: The backend reads city temperature data from a file and exposes it via a REST API.
2. **User Interface**: The React frontend allows users to select a city from a dropdown.
3. **Temperature Display**: The frontend sends a request to the backend, which returns the temperature data, and displays it to the user.
4. **Weather Navigation**: Users can click a button to be redirected to Google’s weather page for more detailed information.

## How to Run

### Backend
1. Import the project into **Eclipse** or any other code editor.
2. Ensure **Java 11** or above is installed.
3. Set the path to the weather file in `Controller.java` and run the Spring Boot application.

### Frontend
1. Open the frontend directory in **VS Code** or any other code editor.
2. Run `npm install` to install dependencies.
3. Run `npm start` to launch the React application.

## Conclusion
This project showcases the integration of a React frontend with a Spring Boot backend to provide a seamless user experience for fetching city temperature data and navigating to live weather reports.
