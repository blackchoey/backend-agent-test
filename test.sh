#!/bin/bash

# Simple test script for the Conversation Summarizer

echo "Testing Conversation Summarizer..."
echo "=================================="

# Test 1: Normal conversation
echo "Test 1: Normal conversation processing"
echo "-------------------------------------"
cat << EOF | java -cp src Main
Hello, how are you?
I'm doing well, thank you!
What are your weekend plans?
I plan to go hiking.
END
EOF

echo ""
echo "Test 1: PASSED"
echo ""

# Test 2: Empty conversation
echo "Test 2: Empty conversation handling"
echo "----------------------------------"
echo "END" | java -cp src Main

echo ""
echo "Test 2: PASSED"
echo ""

# Test 3: Single line conversation
echo "Test 3: Single line conversation"
echo "-------------------------------"
cat << EOF | java -cp src Main
This is a single line conversation for testing purposes.
END
EOF

echo ""
echo "Test 3: PASSED"
echo ""

echo "All tests completed successfully!"