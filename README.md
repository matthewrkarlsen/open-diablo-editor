# Open Diablo Editor (ODE)

This repository should be *considered deprecated*. Work has continued in the 
[Open Diablo Editor 2.0 repository](https://github.com/matthewrkarlsen/open-diablo-editor-2).

## Overview

This is an MIT-licensed Diablo editor, written in Java. I uploaded the code due to a request from mewmew
(see [official forum thread](http://www.lurkerlounge.com/forums/thread-16344.html)).

The editor also uses other software subject to different licenses, such as Gradle (see Credits/Acknowledgements below).

## Quickstart

Download the built program from [the Nexus Mods page](https://www.nexusmods.com/diablo/mods/1/?) and follow the usage
instructions on that page.

## Slow(er) Start: Build via Gradle and Run

- Install Open JDK 1.8
- Set your JAVA_HOME and add Java 1.8 to your PATH variable
- Install Git from [the Git homepage](https://git-scm.com/downloads)
- Bring up a command prompt for the folder where you want to store the code
    - In Windows, shift + right click in an explorer pane then select open prompt
- Run "git clone https://github.com/matthewrkarlsen/open-diablo-editor.git"
- Enter the `open-diablo-editor` folder and bring up a new prompt
- Run "gradlew createReleaseJar"
- Move the resulting jar from `.../open-diablo-editor/build/libs` to your Diablo folder
- Run the JAR with the command `java -jar open-diablo-editor-0.0.1.jar` (changing the version as appropriate)
    - Diablo.exe will remain unchanged
    - A new DiabloModded.exe will be created
    - No other files will be changed
    - If the DiabloModded.exe exists, ODE will load that in preference to the Diablo.exe
- To run the modded version, double-click on `DiabloModded.exe`
- Enjoy (hopefully)

## Authors/Contributors

The following people have contributed to the project:

- Matthew R. Karlsen
- Robin Eklind (mewmew)
- ChaosMarc

## Credits/Acknowledgements

The [Diablo 1 mod workshop](http://www.thedark5.com/info/mod.html) (dead link) has proven to be extremely valuable in
the construction of this software.

A recent mirror for the mod workshop is available [here](https://d1ablo.gitlab.io/d1-mod-workshop).

The workshop was originally created by Charlie with assistance from Jarulf.

A big thanks to all those who hosted it for so long.

The gradle wrapper is part of [Gradle](https://gradle.org/), licensed under the Apache 2.0 license.

JUnit 4 is used for testing, licensed under the Eclipse Public License 1.0.

## License

The MIT License (MIT)

Copyright (c) 2015-2020 Matthew R. Karlsen

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
