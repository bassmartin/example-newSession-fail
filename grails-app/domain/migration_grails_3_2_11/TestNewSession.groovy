package migration_grails_3_2_11

class TestNewSession {

    String uniqueString

    static constraints = {
        uniqueString validator: { String value, TestNewSession object ->
            return TestNewSession.withNewSession {
                TestNewSession otherWithSame = TestNewSession.findByUniqueString(value)
                if (otherWithSame)
                    return 'failed'
            }
        }
    }
}
