package com.postliu.imageloadersample

data class AppData(
    val buildIcon: String,
    val time: String
) {

    val iconUrl get() = "https://www.pgyer.com/image/view/app_icons/${buildIcon}"

    companion object {
        val defaultList = listOf(
            AppData("5466f8cc131e981a233f4100b267295b", "2023-06-21 17:31:35"),
            AppData("6398dad17e2f5b098238bc4307776925", "2023-06-21 17:31:35"),
            AppData("3caee24b29b94f1ad66de653454b0112", "2023-06-21 17:31:35"),
            AppData("2fdd1fd8194dd9f3f4df2a7cb47cbe37", "2023-06-21 17:31:35"),
            AppData("699d48c62aead695da87b4dbe7a9049d", "2023-06-21 17:31:35"),
            AppData("56cebd4d357bacf97ece683ec58248cc", "2023-06-21 17:31:35"),
            AppData("3b923f2b17f4ded9cd82eed03ae92735", "2023-06-21 17:31:35"),
            AppData("8cb1563468bdf809443335aa431fc167", "2023-06-21 17:31:35"),
            AppData("d0559a3ee9d46c883588bf7e6fbac204", "2023-06-21 17:31:35"),
            AppData("9dabab5e2fcf75eec71e93aa73209922", "2023-06-21 17:31:35"),
            AppData("2564353bbd0ac573c08043ed3ceaf6e5", "2023-06-21 17:31:35"),
            AppData("c7be9f1fd0064cc0158c0ab05a0b9739", "2023-06-21 17:31:35"),
            AppData("8b66cfdb6453910359402404c39c503d", "2023-06-21 17:31:35"),
            AppData("c1df569ce22d0e9bd37e78a6b463a083", "2023-06-21 17:31:35"),
            AppData("8965131732d1e67200a511ae5530a96f", "2023-06-21 17:31:35")
        )
    }
}
