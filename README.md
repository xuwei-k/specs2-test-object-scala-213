# specs2-test-object-scala-213




https://travis-ci.com/github/xuwei-k/specs2-test-object-scala-213/jobs/321912420#L424


```
[error] java.lang.AssertionError: assertion failed: test_object.txt does not exists
[error] 	at scala.Predef$.assert(Predef.scala:223)
[error] 	at $29937a08811435557de7$.$anonfun$$sbtdef$1(/home/travis/build/xuwei-k/specs2-test-object-scala-213/build.sbt:5)
[error] 	at scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.java:23)
[error] 	at sbt.std.Transform$$anon$3.$anonfun$apply$2(Transform.scala:46)
[error] 	at sbt.std.Transform$$anon$4.work(Transform.scala:67)
[error] 	at sbt.Execute.$anonfun$submit$2(Execute.scala:281)
[error] 	at sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:19)
[error] 	at sbt.Execute.work(Execute.scala:290)
[error] 	at sbt.Execute.$anonfun$submit$1(Execute.scala:281)
[error] 	at sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:178)
[error] 	at sbt.CompletionService$$anon$2.call(CompletionService.scala:37)
[error] 	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error] 	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
[error] 	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error] 	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
[error] 	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
[error] 	at java.lang.Thread.run(Thread.java:748)
[error] (check) java.lang.AssertionError: assertion failed: test_object.txt does not exists
```
