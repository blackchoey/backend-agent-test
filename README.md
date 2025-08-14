# Microsoft Teams App Development Guide

This repository demonstrates how to create a Microsoft Teams application using Java and the Microsoft Bot Framework.

## Overview

This Teams app provides a basic bot that can:
- Respond to messages in Teams channels
- Handle personal conversations
- Demonstrate Teams-specific functionality

## Prerequisites

Before you start, ensure you have:

1. **Java Development Kit (JDK) 11 or later**
2. **Maven** for dependency management
3. **Microsoft Teams** (web, desktop, or mobile)
4. **ngrok** for local development tunneling
5. **Microsoft Azure** account (for Bot Framework registration)

## Quick Start

### 1. Clone and Setup

```bash
git clone <repository-url>
cd backend-agent-test
mvn clean install
```

### 2. Create a Bot in Azure

1. Go to [Azure Portal](https://portal.azure.com)
2. Create a new **Bot Channels Registration**
3. Note down your **App ID** and **App Password**

### 3. Configure Environment

Create a `.env` file (or set environment variables):

```env
MicrosoftAppId=your-app-id-here
MicrosoftAppPassword=your-app-password-here
```

### 4. Run the Application

```bash
mvn spring-boot:run
```

The app will start on `http://localhost:3978`

### 5. Setup ngrok for Local Testing

```bash
ngrok http 3978
```

Copy the HTTPS URL (e.g., `https://abc123.ngrok.io`) and update your bot's messaging endpoint in Azure to `https://abc123.ngrok.io/api/messages`

## Teams App Manifest

The app includes a Teams manifest (`teams-manifest/manifest.json`) that defines:
- App metadata and branding
- Bot configuration
- Permissions and capabilities

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/example/teamsapp/
│   │       ├── Application.java          # Spring Boot main class
│   │       ├── TeamsBot.java             # Main bot logic
│   │       └── controller/
│   │           └── BotController.java    # Web controller for bot messages
│   └── resources/
│       └── application.properties        # App configuration
teams-manifest/
├── manifest.json                         # Teams app manifest
├── color.png                            # App icon (192x192)
└── outline.png                          # App outline icon (32x32)
```

## Deployment

### Azure App Service

1. Build the application: `mvn clean package`
2. Deploy the JAR file to Azure App Service
3. Set environment variables in App Service configuration
4. Update bot messaging endpoint to your App Service URL

### Teams Installation

1. Zip the `teams-manifest` folder contents
2. Upload to Teams via **Apps** > **Upload a custom app**

## Development Tips

1. **Use ngrok** for local development to expose your local server
2. **Check Azure logs** for debugging bot registration issues
3. **Validate manifest** using Teams Developer Portal
4. **Test incrementally** - start with simple message responses

## Common Issues

- **Bot not responding**: Check messaging endpoint URL and Azure configuration
- **Authentication errors**: Verify App ID and Password are correct
- **Manifest errors**: Validate JSON syntax and required fields

## Next Steps

- Add rich cards and attachments
- Implement adaptive cards
- Add authentication flows
- Create task modules
- Integrate with Microsoft Graph API

## Resources

- [Microsoft Teams Platform Documentation](https://docs.microsoft.com/en-us/microsoftteams/platform/)
- [Bot Framework Java SDK](https://github.com/microsoft/botbuilder-java)
- [Teams App Studio](https://docs.microsoft.com/en-us/microsoftteams/platform/concepts/build-and-test/app-studio-overview)