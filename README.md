# Conversation Summarizer

A Java application that processes conversation text and generates comprehensive summaries with statistics and key topic analysis.

## Features

- **Interactive Input**: Prompts users to provide conversation details
- **Smart Summarization**: Generates structured summaries with:
  - Line and word count statistics
  - Content overview with first and last lines
  - Key topics based on word frequency analysis
- **Error Handling**: Gracefully handles missing or empty conversation data
- **User-Friendly Interface**: Clear prompts and formatted output

## Usage

### Compilation

```bash
javac src/Main.java
```

### Running the Application

```bash
java -cp src Main
```

### Interactive Mode

1. Run the application
2. When prompted, paste your conversation text
3. Type `END` on a new line when finished
4. View the generated summary

### Example Input/Output

**Input:**
```
Hello there, how are you doing today?
I'm doing great, thanks for asking!
What are your plans for the weekend?
I'm thinking about going hiking if the weather is nice.
That sounds like a wonderful idea!
END
```

**Output:**
```
CONVERSATION SUMMARY
==================

Statistics:
- Total lines: 5
- Total words: 36

Content Overview:
- First line: Hello there, how are you doing today?
- Last line: That sounds like a wonderful idea!

Key Topics (most frequent words):
- doing (2 times)
- asking (1 times)
- going (1 times)
- like (1 times)
- idea (1 times)

Summary generation complete!
```

### File Input

You can also provide input via file redirection:

```bash
cat conversation.txt | java -cp src Main
```

Where `conversation.txt` contains your conversation followed by `END` on the last line.

## Error Handling

If no conversation is provided, the application displays:
```
It seems that the conversation you intended to provide is missing.
Please share the details of the conversation so I can create a summary for you.
```

## Requirements

- Java 17 or higher
- Standard Java libraries (no external dependencies)

## Architecture

The application consists of two main classes:

- **Main**: Entry point that initializes and runs the ConversationSummarizer
- **ConversationSummarizer**: Core logic for input handling, processing, and summary generation

## Contributing

This is a demonstration project. For improvements or bug reports, please create an issue or submit a pull request.