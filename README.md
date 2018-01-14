 <h1 align="center"> building_PDE_file</h1>


## SUMMARY:
This repo capture the commands required to build and execute a pde file by building and executing
the java file version of the pde and using the core.jar (and associated libs) inthe class path.


## REFERENCE:
[How to Compile and Run Java Code from a Command Line] (http://www.sergiy.ca/how-to-compile-and-launch-java-code-from-command-line/)


## OUTPUT FROM processing-java --help

<pre>
Command line edition for Processing 0263 (Java Mode)

--help               Show this help text. Congratulations.
--sketch=<name>      Specify the sketch folder (required)
--output=<name>      Specify the output folder (optional and
                     cannot be the same as the sketch folder.)

--force              The sketch will not build if the output
                     folder already exists, because the contents
                     will be replaced. This option erases the
                     folder first. Use with extreme caution!

--build              Preprocess and compile a sketch into .class files.
--run                Preprocess, compile, and run a sketch.
--present            Preprocess, compile, and run a sketch in presentation mode.

--export             Export an application.
--no-java            Do not embed Java. Use at your own risk!
--platform           Specify the platform (export to application only).
                     Should be one of 'windows', 'macosx', or 'linux'.

The --build, --run, --present, or --export must be the final parameter
passed to Processing. Arguments passed following one of those four will
be passed through to the sketch itself, and therefore available to the
sketch via the 'args' field. To pass options understood by PApplet.main(),
write a custom main() method so that the preprocessor does not add one.
https://github.com/processing/processing/wiki/Command-Line

</pre>

## EXAMPLE:  Relevant commands

1.  `cd C:\Users\C\Documents\Processing\CMsketches\multiple_cube_rotations>`
2.  Now open in **Processing** and export it. The command tree produces (omitting some files): 

<pre>
Folder PATH listing for volume Windows8_OS
Volume serial number is 4E33-E988
C:.
+---application.windows64   <-----Produced (mostly) by [2]
¦   +---bin                 <-----Produced by [6]
¦   +---java                <-----Generated by export: Java libs [OMITED in this repo]
¦   ¦   +---bin             
¦   ¦   ¦   +---dtplugin
¦   ¦   ¦   +---plugin2
¦   ¦   ¦   +---server
¦   ¦   +---lib
¦   ¦       +---amd64
¦   ¦       +---applet
¦   ¦       +---cmm
¦   ¦       +---deploy
¦   ¦       +---ext
¦   ¦       +---fonts
¦   ¦       +---images
¦   ¦       ¦   +---cursors
¦   ¦       +---jfr
¦   ¦       +---management
¦   ¦       +---security
¦   +---lib               <-----[OMITED in this repo]
¦   +---source
+---tmpp                  <-----Produced by [3]
    +---source

</pre>

3. ```C:\Users\C\Documents\Processing\CMsketches\multiple_cube_rotations>processing-java
      --force 
     --sketch=C:\Users\C\Documents\Processing\CMsketches\multiple_cube_rotations 
     --output=C:\Users\C\Documents\Processing\CMsketches\multiple_cube_rotations\tmpp 
     --run```

**Note 3**: It creates tmpp/multiple_cube_rotations.class and tmpp/source/multiple_cube_rotations.java

4. `cd application.windows64`

5. `dir lib /a:a /w`
core.jar  gluegen-rt-natives-windows-amd64.jar   gluegen-rt.jar  jogl-all-natives-windows-amd64.jar jogl-all.jar multiple_cube_rotations.jar

6. `mkdir bin`

7. `javac -d bin -sourcepath source -cp lib/core.jar;lib/gluegen-rt-natives-windows-amd64.jar;lib/gluegen-rt.jar;lib/jogl-all-natives-windows-amd64.jar;lib/jogl-all.jar source/multiple_cube_rotations.java`

<pre>
Note: source\multiple_cube_rotations.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
</pre> 

**Note 7**: This step create JVM byte code. It creates `/bin/multiple_cube_rotations.class`

8. `java -cp bin;lib/core.jar;lib/gluegen-rt-natives-windows-amd64.jar;lib/gluegen-rt.jar;lib/jogl-all-natives-windows-amd64.jar;lib/jogl-all.jar multiple_cube_rotations`

**Note 8**: it launches the application (Tested on Windows 10 on 14-Jan-2018)


## Bugs and Issues

Any suggestions or comments, please comment in the [issue section](https://github.com/kfrajer/cornerDetector/issues) of this GitHub.

## Creator

TBC

## Copyright and License

TBC
