package dotty.communitybuild

import java.nio.file.{Path, Paths}

import org.junit.{Ignore, Test}

class CommunityBuildTest extends BuildTest {
  def testDirectory: Path =
    Paths.get(sys.props("user.dir") + "/out/")

  @Test def algebra = project(
    gitUrl = "https://github.com/dotty-staging/algebra",
    branch = "sbt1",
    command = "coreJVM/compile"
  )

  @Test def betterfiles = project(
    gitUrl = "https://github.com/dotty-staging/better-files",
    branch = "sbt1",
    command = "dottyCompile"
  )

  @Test def scalacheck = project(
    gitUrl = "https://github.com/dotty-staging/scalacheck",
    branch = "sbt1",
    command = "jvm/compile"
  )

  @Test def ScalaPB = project(
    gitUrl = "https://github.com/dotty-staging/ScalaPB",
    branch = "sbt1",
    command = "dottyCompile"
  )

  @Test def scalatest = project(
    gitUrl = "https://github.com/dotty-staging/scalatest",
    branch = "sbt1",
    command = "scalatest/compile"
  )

  @Test def scopt = project(
    gitUrl = "https://github.com/dotty-staging/scopt",
    branch = "sbt1",
    command = "scoptJVM/compile"
  )

  @Test def squants = project(
    gitUrl = "https://github.com/dotty-staging/squants",
    branch = "sbt1",
    command = "squantsJVM/compile"
  )

  @Test def collectionstrawman = project(
    gitUrl = "https://github.com/dotty-staging/collection-strawman",
    branch = "sbt1",
    command = "dottyCompile"
  )
}
