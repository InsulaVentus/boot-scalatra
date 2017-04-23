package no.insulaventus.bootscalatra.health

import org.springframework.boot.actuate.health.{Health, HealthIndicator}
import org.springframework.stereotype.Component

@Component
class RequestThreadsAvailable extends HealthIndicator {

  override def health(): Health = {
    Health
      .up()
      .withDetail("Available", 2)
      .build()
  }
}
