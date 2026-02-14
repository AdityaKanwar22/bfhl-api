🚀 BFHL API – Spring Boot Web Service

Hi 👋
This is a Spring Boot based REST API built as part of the BFHL assignment.

The project supports multiple mathematical operations and AI-based responses through API integration.

It is deployed live on Render.

🌐 Live URL:

https://bfhl-api-5dl3.onrender.com

🛠 Tech Stack

Java 17

Spring Boot

Maven

REST APIs

Render (Deployment)

Gemini API (Attempted AI Integration)

📌 Available APIs
✅ Health Check
GET /health


Used to check if the service is running.

✅ Main BFHL API
POST /bfhl

Sample Request:
{

  "operation": "fibonacci",
  "value": 10
  
}

Supported Operations:

fibonacci

prime

lcm

hcf

ai

📦 Example Response
{

  "is_success": true,
  "official_email": "aditya1762.be23@chitkara.edu.in",
  "data": [0,1,1,2,3,5,8],
  "error": null
  
}


🤖 AI Integration

The project was designed to integrate with Google's Gemini API for handling AI-based prompts.

However, after multiple attempts:

Different Gemini models were tried (gemini-pro, gemini-1.5-flash, gemini-2.0-flash)

API versions (v1, v1beta) were tested

Correct request format was implemented

Unfortunately, the Gemini API consistently returned:

404 Model Not Found

429 Quota Exceeded

Free-tier request limit = 0

Because of this quota restriction and model access limitations, the Gemini integration could not be fully activated in production.

The rest of the application works correctly.

🚀 Deployment

The application is deployed on Render (Free Instance).

Deployment steps included:

Push project to GitHub

Connect GitHub repo to Render

Select Docker environment

Automatic Maven build

Service exposed on port 8080

⚠️ Notes

Free Render instances may sleep after inactivity.

Gemini API free-tier quota issues prevented live AI functionality.

All mathematical operations work correctly.

👨‍💻 Author

Aditya Kanwar

Chitkara University
