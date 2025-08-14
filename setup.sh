#!/bin/bash

# Teams App Development Setup Script
echo "🚀 Setting up Microsoft Teams App Development Environment..."

# Check Java installation
if ! command -v java &> /dev/null; then
    echo "❌ Java is not installed. Please install Java 11 or later."
    exit 1
fi

echo "✅ Java found: $(java -version 2>&1 | head -n 1)"

# Check Maven installation
if ! command -v mvn &> /dev/null; then
    echo "❌ Maven is not installed. Please install Maven."
    exit 1
fi

echo "✅ Maven found: $(mvn -version | head -n 1)"

# Install dependencies
echo "📦 Installing dependencies..."
mvn clean install -q

if [ $? -eq 0 ]; then
    echo "✅ Dependencies installed successfully"
else
    echo "❌ Failed to install dependencies"
    exit 1
fi

# Create .env file if it doesn't exist
if [ ! -f .env ]; then
    echo "📝 Creating .env file from template..."
    cp .env.example .env
    echo "⚠️  Please update .env with your Bot Framework credentials"
fi

echo ""
echo "🎉 Setup complete! Next steps:"
echo ""
echo "1. Register your bot in Azure Bot Service"
echo "2. Update .env with your app credentials"
echo "3. Run: mvn spring-boot:run"
echo "4. Use ngrok to expose your local server"
echo "5. Upload teams-manifest to Teams"
echo ""
echo "For detailed instructions, see README.md"