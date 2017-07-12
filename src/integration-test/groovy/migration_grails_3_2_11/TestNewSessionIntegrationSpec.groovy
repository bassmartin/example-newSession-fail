package migration_grails_3_2_11

import grails.test.mixin.integration.Integration
import grails.transaction.Rollback
import spock.lang.Specification

@Integration
@Rollback
class TestNewSessionIntegrationSpec extends Specification {

    void "test withNewSession"() {
        when: "creating new test object"
        TestNewSession testNewSession = new TestNewSession(uniqueString: "123")
        testNewSession.save(flush: true)

        then: "won't get here"
        noExceptionThrown()
    }

}
