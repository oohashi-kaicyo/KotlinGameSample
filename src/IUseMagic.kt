/**
 * Created by oohashi on 2017/06/20.
 */
interface IUseMagic {
    var MagicList: Array<IMagic> get
    var MagicPoint: int get
    var SelectMaigic: IMagic get
    fun UseMagic()
}
