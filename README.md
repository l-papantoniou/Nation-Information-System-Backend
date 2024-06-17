# Nation-Information-System-Backend

**README.md**

```markdown
# Nations Backend

This is the backend part of the Nations Information System, built with Spring Boot. It serves the RESTful API for the frontend to consume and interacts with the database to fetch and store data about countries, their regions, languages spoken, and various statistics.

## Features

1. **API Endpoints**:
   - `/api/countries`: Fetches all countries.
   - `/api/countries/{id}`: Fetches details of a specific country by ID.
   - `/api/countries/{id}/languages`: Fetches all languages spoken in a specific country.
   - `/api/country-stats`: Fetches all country statistics.
   - `/api/country-stats/country/{countryId}`: Fetches statistics for a specific country.
   - `/api/regions`: Fetches all regions.

2. **Database Configuration**:
   - The backend is configured to connect to a MySQL database.
   - The database schema includes tables for countries, regions, languages, and country statistics.

3. **CORS Configuration**:
   - Configured to allow cross-origin requests from the Angular frontend.

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- MySQL database

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/l-papantoniou/Nation-Information-System-Backend.git
