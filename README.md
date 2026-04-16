# 🚀 BFHL API – Spring Boot Web Service

Hi 👋
This is a Spring Boot based REST API built as part of the BFHL assignment.

The project supports multiple mathematical operations and AI-based responses using external API integration.

The application is deployed live on Render.

---

## 🌐 Live URL

https://bfhl-api-5dl3.onrender.com

---

## 🛠 Tech Stack

* Java 17
* Spring Boot
* Maven
* REST APIs
* Docker
* Render (Deployment)
* OpenRouter API (AI Integration)

---

## 📌 Available APIs

### ✅ Health Check

GET /health

Used to verify whether the service is running.

---

### ✅ Main BFHL API

POST /bfhl

Processes operations based on the request.

---

## 📥 Sample Request

```json
{
  "key": "fibonacci",
  "value": 10
}
```

---

## ⚙️ Supported Operations

* fibonacci → Generates Fibonacci series
* prime → Filters prime numbers from a list
* lcm → Calculates Least Common Multiple
* hcf → Calculates Highest Common Factor
* ai → Handles AI-based text queries using OpenRouter

---

## 📦 Example Response

```json
{
  "is_success": true,
  "official_email": "aditya1762.be23@chitkara.edu.in",
  "data": [0,1,1,2,3,5,8]
}
```

---

## 🤖 AI Integration (OpenRouter)

AI functionality is implemented using the **OpenRouter API**, which allows access to multiple AI models through a single endpoint.

### 🔍 How It Works

* When `"key": "ai"` is passed
* The request is forwarded to OpenRouter
* Response is returned as plain text

---

## ⚙️ Requirements

Set your API key as an environment variable:

```bash
OPENROUTER_API_KEY=your_api_key_here
```

---

## ⚠️ Notes

* AI response depends on external API availability
* If API key is missing or invalid, request will fail
* Gemini API was previously tested but not used due to quota limitations

---

## 🚀 Deployment

The application is deployed on Render (Free Instance).

### Deployment Steps

1. Push project to GitHub
2. Connect repository to Render
3. Select Docker environment
4. Build using Maven wrapper
5. Deploy service on port 8080

---

## ⚙️ Run Locally

```bash
git clone https://github.com/AdityaKanwar22/bfhl-api.git
cd bfhl-api
./mvnw spring-boot:run
```

---

## 🧪 Testing

Use Postman to test APIs.

### Example (AI)

```json
{
  "key": "ai",
  "value": "Explain Artificial Intelligence"
}
```

---

## ⚠️ Additional Notes

* Free Render instances may sleep after inactivity
* Environment variables must be configured for AI
* All mathematical operations are fully functional

---

## 👨‍💻 Author

Aditya Kanwar

Chitkara University
