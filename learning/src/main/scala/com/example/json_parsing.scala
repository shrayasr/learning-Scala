import org.json4s._
import org.json4s.native.JsonMethods._

case class User(username: String, profile_picture: String, id: String, full_name: String)

object json_parsing {

  def main(args: Array[String]): Unit = {

    implicit val formats = DefaultFormats
    val json = parse(""" {"pagination":{},"meta":{"code":200},"data":[{"username":"agarchaa","profile_picture":"https://igcdn-photos-e-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/11024374_458228960993740_307558629_a.jpg","id":"348548712","full_name":"Anita G"},{"username":"christengerhart","profile_picture":"https://igcdn-photos-g-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/11098675_853234708074950_832054390_a.jpg","id":"182142054","full_name":"christengerhart"},{"username":"hilisaa","profile_picture":"https://igcdn-photos-a-a.akamaihd.net/hphotos-ak-xfa1/t51.2885-19/11055767_1631416150425600_1081817923_a.jpg","id":"6166093","full_name":"LISA LEE"},{"username":"onemeerkat","profile_picture":"https://igcdn-photos-b-a.akamaihd.net/hphotos-ak-xfa1/t51.2885-19/10817999_866696110029393_1645520584_a.jpg","id":"33959880","full_name":""},{"username":"stylish_by_nature","profile_picture":"https://igcdn-photos-c-a.akamaihd.net/hphotos-ak-xpa1/outbound-distillery/t0.0-20/OBPTH/profiles/profile_489221579_75sq_1383463217.jpg","id":"489221579","full_name":"Shalini Chopra"},{"username":"moderngypsy","profile_picture":"https://igcdn-photos-c-a.akamaihd.net/hphotos-ak-xfa1/t51.2885-19/10914440_339102246292490_2049414087_a.jpg","id":"3179774","full_name":"I PLAY DRESS UP PROFESSIONALLY"},{"username":"mscocoqueen","profile_picture":"https://igcdn-photos-c-a.akamaihd.net/hphotos-ak-xpa1/t51.2885-19/928766_449773435170226_1027974926_a.jpg","id":"230922179","full_name":"Sukhneet Wadhwa"},{"username":"chrystelleaudette","profile_picture":"https://igcdn-photos-b-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10958530_777490019012457_1136560020_a.jpg","id":"11923507","full_name":"CHRYSTELLE AUDETTE ✖️"},{"username":"official_tia_bhatia","profile_picture":"https://igcdn-photos-b-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10995247_901658979874361_1873241288_a.jpg","id":"51849892","full_name":"Tia_Bhatia"},{"username":"thesandylion","profile_picture":"https://igcdn-photos-f-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10755768_1394631317495517_322192498_a.jpg","id":"53811476","full_name":"ESSKAYJI."}]}  """)
    val jsonParsed = (json \ "data").extract[List[User]]

    println(jsonParsed)

  }
}
