## How to configure- on linux
1. Install jdk
   ```
   sudo apt-get install default-jdk
   ```
2. Install antrl
```
   cd /usr/local/lib
   sudo curl -O https://www.antlr.org/download/antlr-4.9.2-complete.jar
   export CLASSPATH=".:/usr/local/lib/antlr-4.9.2-complete.jar:$CLASSPATH"
```

3. Create virtual environment & install packages
   ```bash
    cd ${project folder}
    python3 -m venv venv
    source venv/bin/activate
    pip install wheel
    pip install antlr4-python3-runtime
   ```
3. Add to your .bashrc:
```
   alias grun='java org.antlr.v4.gui.TestRig'
   alias antlr4='java -jar /usr/local/lib/antlr-4.9.2-complete.jar'
```
4. Source bashrc:
```
   source ./.bashrc
```

## (optional) Creating lexer and parser - this command will automatically generate whole dist folder
*Do not do  it if dist folder is up to date with the grammar*
```
antlr4 -Dlanguage=Python3 ./antlr4/App.g4  -visitor -o dist3
```

## How to run main.py - linux
1. Go into project folder
2. Activate virtual env `source venv/bin/activate`
3. `python3 main.py`
   
## How to open on windows
1. git clone
2. Create virtual environment & install packages
   ```bash
    cd ${project folder}
    python -m venv venv
    venv\Scripts\activate
    pip install wheel
    pip install antlr4-python3-runtime
   ```

## How to run main.py - windows
1. Go into project folder
2. Activate virtual env `venv\Scripts\activate`
3. `python main.py`