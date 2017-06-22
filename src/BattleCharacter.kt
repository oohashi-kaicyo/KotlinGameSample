
import sun.security.util.Length

/**
 * Created by oohashi on 2017/06/18.
 */
abstract class BattleCharacter: IAttack, ICharacteristic, IAttackPoint {
    var Hp:    Int get set
    var Level: Int get set
    var SelectedWeapon: IWeapon get set
    override var Characteristics: Array<Characteristic> get set
    override var AttackPoint: Int get set
    // TODO: 装備用のスロットクラスの作成
    constructor() {
        Hp = 0
        Level = 0
        SelectedWeapon = null
        Characteristics = arrayOf()
        AttackPoint = 0
    }
    override fun attack(enemies: Array<BattleCharacter>) {
        val myself: BattleCharacter = this
        var damage: Damage = Damage(myself, enemies)
    }
    // TODO: バトルキャラに装備品を装備させる(スロットに装填)
    fun Equip(slotIdx: Int, equipment: IEquipment) {
        error("未実装")
    }
}
