
## Server-1 (Honors Evaluation Server)

The Server-1 component of the Honors Enrolment Pre-assessment System (HEPaS) is responsible for handling client requests, processing data, and evaluating the eligibility of users for Honors studies. It is a crucial part of the three-tier distributed system, facilitating communication between the client application and the database server (server-2).

### Features:

- **Authentication**: Authenticates users and verifies their identity before processing requests.
  
- **Data Processing**: Receives user input from the client application, and performs necessary calculations such as averaging unit scores, selecting best scores, and evaluating eligibility based on predefined criteria.

- **Evaluation Criteria**: Implements the evaluation criteria specified in the project requirements to determine if a user qualifies for Honors studies.

- **Communication**: Communicates with the client application using Remote Method Invocation (RMI) or Remote Procedure Call (RPC) to exchange data and assessment results.

### Components:

- **Remote Interface**: Defines methods for client-server communication, including authentication, data processing, and evaluation.

- **Server Implementation**: Implements the remote interface, providing concrete implementations for handling client requests and evaluating eligibility.

- **Error Handling**: Includes mechanisms for error handling and exception management to ensure robustness and reliability.

### Extensions for Phase 2:

- **Integration with Server-2**: Extends functionality to communicate with the database server (server-2) to access OUST students' course learning records for assessment.

- **Data Validation**: Implements additional data validation to ensure the integrity and consistency of input data before processing.

### Testing:

- **Unit Testing**: Includes unit tests to verify the functionality of individual components and ensure proper integration.

- **Integration Testing**: Conducts integration testing to validate the interaction between the client application, server-1, and server-2.

### Technologies:

- **Programming Language**: Implemented in JAVA.
- **Communication Protocol**: Utilizes for client-server communication.
- **Frameworks/Libraries**: for enhanced functionality.

### Setup Instructions:



### Contributions:

Contributions to the Server-1 component are welcome! Please follow the contribution guidelines outlined in the repository.

### License:

This project is licensed under the MIT. See the LICENSE file for details.
