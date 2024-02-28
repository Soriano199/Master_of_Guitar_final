package com.example.update_master_of_guitar

class GuitarristasProvider {

    companion object{
        val listaGuitarristas = listOf<Guitarrista>(
            Guitarrista(
                "Slash",
                "Guns N' Roses",
                "Les Paul",
                "data:image/jpeg;base64,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",
                58

            ),

            Guitarrista(
                "Jimi Hendrix",
                "The Jimi Hendrix Experience",
                "Fender Stratocaster",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRuxI1soW8gUPbDVvU7aP9HmPg7xc8RjDeQWA&usqp=CAU",
                27

            ),
            Guitarrista(
                "Tony Lommi",
                "Black Sabbath",
                "Gibson SG",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSfSk1Ti0u3sl5aSYD3uTRKolqKclAlB0tEqg&usqp=CAU",
                75

            ),

            Guitarrista(
                "James Hetfield",
                "Metallica",
                "Gibson Flying V",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSG9hz-fNYeIk1OrnJCAM3ZBoOrBm9ZPI4rWQ&usqp=CAU",
                60

            ),

            Guitarrista(
                "Angus Young",
                "AC/DC",
                "SG",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTcDaa2suxx1_FptPaR5chnqy9W_a766E4F4Q&usqp=CAU",
                68

            ),

            Guitarrista(
                "Mark Knopfler",
                "Dire Straits",
                "Fender Stratocaster",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFZOVk-Hw7Wdn1MnCMXeRlr3HSVPSHA-2x3g&usqp=CAU",
                74

            ),

            Guitarrista(
                "Kurt Cobain",
                "Nirvana",
                "Fender JAG-STANG",
                "https://buydesigntshirt.com/cdn/shop/products/Untitled-1_2a3c70fe-d7b5-496d-a112-6e192d9bc981_1200x1200.png?v=1584418053",
                27

            ),

            Guitarrista(
                "David Gilmour",
                "Pink Floyd",
                "Fender Stratocaster",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQIKTFwr_X5TPwgL89XH77ZSYTB0L51yLDJ7g&usqp=CAU",
                77

            ),

            Guitarrista(
                "Keith Richards",
                "The Rolling Stones",
                "Fender Telecaster Micawber",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQt3QBiRv_fU1CfFNpDh1Doydl06xhCSimmuQ&usqp=CAU",
                80

            ),

            Guitarrista(
                "John Frusciante",
                "Red Hot Chili Peppers",
                "Fender Stratocaster",
                "https://static.posters.cz/image/750/posters/red-hot-chili-peppers-logo-i4622.jpg",
                53

            ),


        )
    }
}