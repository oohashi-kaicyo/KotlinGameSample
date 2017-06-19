/**
 * Created by oohashi on 2017/06/18.
 */
abstract class BattleCharacter: IAttack {
    var hp:    Int get set
    var level: Int get set
    constructor() {
        this.hp = 0
        this.level = 1
    }
    override fun attack(enemies: Array<BattleCharacter>) {
        val myself: BattleCharacter = this
        var damage: Damage = Damage(myself, enemies)
    }
}
