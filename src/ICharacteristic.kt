/**
 * Created by oohashi on 2017/06/20.
 */
enum class Characteristic {
    dragonAttributesSpecialAttack,
    darknessAttributesSpecialAttack,
    pairMagicalPower,
    noAttribute,
    fireAttribute,
    thunderAttribute,
    Machinery,
    magic,
    human
}
interface ICharacteristic {
    var Characteristices: Array<Characteristic> get
}