name := "Simple Project"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq ( 
	"org.apache.spark" %% "spark-core" % "2.1.1",
	"org.apache.spark" %% "spark-sql" % "2.1.1",
	"org.apache.spark" %% "spark-streaming" % "2.1.1",
	"org.apache.spark" %% "spark-streaming-kinesis-asl" % "2.1.1",
	"com.typesafe.scala-logging" %% "scala-logging" % "3.7.1"
)

