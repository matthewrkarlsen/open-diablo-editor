# Open Diablo Editor (ODE)

## Overview

This is an MIT-licensed Diablo editor, written in Java. I uploaded the code due to a request from mewmew (see official forum thread at http://www.lurkerlounge.com/forums/thread-16344.html).

The editor also uses other software subject to different licenses, such as Gradle (see Credits/Acknowledgements below).

## Quickstart

Download the built program from https://www.nexusmods.com/diablo/mods/1/? and follow the usage instructions on that page.


## Slow(er) Start: Build via Gradle and Run

- Install Java 1.8 (from http://www.oracle.com/technetwork/java/javase/downloads/index.html)
- Set your JAVA_HOME and add Java 1.8 to your PATH variable
- Install Git (https://git-scm.com/downloads)
- Bring up a command prompt for the folder where you want to store the code
    - In Windows, shift + right click in an explorer pane then select open prompt
- Run "git clone https://github.com/quixotic-cynic/open-diablo-editor.git"
- Enter the OpenDiabloEditor folder and bring up a new prompt
- Run "gradlew createReleaseJar"
- Move the resulting jar from .../OpenDiabloEditor/build/libs to your Diablo folder
- Run the JAR with the command "java -jar open-diablo-editor-0.0.1.jar" (changing the version as appropriate)
    - Diablo.exe will remain unchanged
    - A new DiabloModded.exe will be created
    - No other files will be changed
    - If the DiabloModded.exe exists, ODE will load that in preference to the Diablo.exe
- Enjoy (hopefully)
- Send me comments

## Authors/Contributors

    Name: Matthew R. Karlsen
    Email: firstname at lastname dot me dot uk
    Alias 1: quixotic-cynic
    Alias 2: quixoticynic (some sites do not allow "-" in usernames)

    Name:  Robin Eklind
    Alias 1: mewmew 
    
    Name: ?
    Alias: ChaosMarc


## Credits/Acknowledgements

The mod workshop located at http://www.thedark5.com/info/mod.html has proven to be extremely valuable in the construction of this software.

The workshop was originally created by Charlie with assistance from Jarulf.

A big thanks to Zamal & Zenda for continuing to host it, and not letting it disappear.

The gradle wrapper is part of Gradle (https://gradle.org/), licensed under the Apache 2.0 license.

We use JUnit 4 for testing, licensed under the Eclipse Public License 1.0.


## License

The MIT License (MIT)

Copyright (c) 2015 Matthew R. Karlsen

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
