package no.nordea.tokenexchangepoc.web

import org.scalatra.ScalatraServlet
import org.slf4j.{Logger, LoggerFactory}


class TheServlet extends ScalatraServlet {

  protected val logger: Logger = LoggerFactory.getLogger(classOf[TheServlet])

  get("/") {
    logger.info("Returning some - Yeah!")

    Thread.sleep(5000L)

    "Some"
  }

}
