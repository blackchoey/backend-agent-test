#!/usr/bin/env bash

##############################################################################
# Gradle wrapper script
##############################################################################

# Find Java
if [ -n "$JAVA_HOME" ] ; then
    JAVACMD="$JAVA_HOME/bin/java"
else
    JAVACMD="java"
fi

# Determine the directory of this script
cd "$(dirname "$0")"
APP_HOME="$(pwd)"

# For now, let's just use gradle directly
exec gradle "$@"