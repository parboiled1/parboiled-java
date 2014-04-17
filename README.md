## How to build

**You must have a JDK version 6 or 7 for this package to work**. Make sure that
you use the same version to build all packages (including this one).

You will need to fork both this project and
[parboiled-core](https://github.com/parboiled1/parboiled-core).

Start by building and installing parboiled-core in your local maven repository with:

```
# Unix...
./gradlew test install
# Windows
gradlew.bat test install
```

Then you can build this package.

