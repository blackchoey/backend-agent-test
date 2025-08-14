# Teams App Testing Guide

This guide shows how to test your Teams app locally before deploying to Microsoft Teams.

## Running the Application

1. **Start the application:**
   ```bash
   mvn spring-boot:run
   ```

2. **Verify it's running:**
   ```bash
   curl http://localhost:3978/api/health
   ```

   Expected response:
   ```json
   {
       "service": "Teams Bot",
       "status": "healthy"
   }
   ```

## Testing Bot Responses

### Test Basic Message
```bash
curl -X POST http://localhost:3978/api/test \
  -H "Content-Type: application/json" \
  -d '{"message": "hello"}'
```

### Test Help Command
```bash
curl -X POST http://localhost:3978/api/test \
  -H "Content-Type: application/json" \
  -d '{"message": "help"}'
```

### Test About Command
```bash
curl -X POST http://localhost:3978/api/test \
  -H "Content-Type: application/json" \
  -d '{"message": "about"}'
```

### Test Time Command
```bash
curl -X POST http://localhost:3978/api/test \
  -H "Content-Type: application/json" \
  -d '{"message": "time"}'
```

### Test Custom Message
```bash
curl -X POST http://localhost:3978/api/test \
  -H "Content-Type: application/json" \
  -d '{"message": "This is a custom message"}'
```

## Available Endpoints

| Endpoint | Method | Description |
|----------|--------|-------------|
| `/api/health` | GET | Health check |
| `/api/messages` | POST | Teams message endpoint |
| `/api/test` | POST | Local testing endpoint |
| `/api/welcome` | POST | Welcome message endpoint |

## Expected Response Format

All bot responses follow this format:
```json
{
    "type": "message",
    "text": "Bot response text here",
    "timestamp": "2025-08-14T02:51:16.815501938"
}
```

## Integration with Teams

Once tested locally:

1. Use ngrok to expose your local server
2. Update bot registration with ngrok URL
3. Install the Teams app using the manifest
4. Test in actual Teams environment

## Troubleshooting

- **Port already in use**: Stop existing processes with `pkill -f "spring-boot:run"`
- **Application won't start**: Check Java version (requires Java 11+)
- **Dependencies fail**: Run `mvn clean install` to refresh dependencies