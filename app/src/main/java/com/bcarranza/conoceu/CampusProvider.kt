package com.bcarranza.conoceu

class CampusProvider {
    companion object{
        val campusList = listOf<Campus>(
            Campus(
                R.string.campus_cu,
                R.string.cu_direccion,
                true
            ),
            Campus(
                R.string.campus_salud,
                R.string.salud_direccion,
                false
            ),
            Campus(
                R.string.campus_mederos,
                R.string.mederos_direccion,
                false
            ),
            Campus(
                R.string.campus_agropecuarias,
                R.string.agropecuarias_direccion,
                false
            ),
            Campus(
                R.string.campus_linares,
                R.string.linares_direccion,
                false
            )
        )
    }
}