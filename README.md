## How to run - on linux
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