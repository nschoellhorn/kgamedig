package eu.dreamcode.kgamedig

import eu.dreamcode.kgamedig.configuration.QueryOptions

object Gamedig {
    private val queryRunner = QueryRunner()

    fun query(queryOptions: QueryOptions) =
            this.queryRunner.run(queryOptions)
}
