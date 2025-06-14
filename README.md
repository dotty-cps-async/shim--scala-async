# shim--scala-async

shim which allows to compile scala program which use [scala-async](https://github.com/scala/scala-async) on dotty with [dotty-cps-async](https://github.com/rssh/dotty-cps-async)

i.e. if you want port you program to dotty without changing source code, then you can replace scala-async dependecy to this shim for building with dotty.

```Scala
   libraryDependencies += "io.github.dotty-cps-async" %% "shim-scala-async" % "1.1.0",
```

['--' in github project name changed to '-' ]


Note, that if you want bug-to-bug compatibility with scala2, than you probably want wait for official port of scala-async compiler plugin.

