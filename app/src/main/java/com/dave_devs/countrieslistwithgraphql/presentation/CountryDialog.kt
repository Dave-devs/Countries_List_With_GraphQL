package com.dave_devs.countrieslistwithgraphql.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.dave_devs.countrieslistwithgraphql.domain.DetailedCountry


@Composable
fun CountryDialog(
    modifier: Modifier = Modifier,
    country: DetailedCountry,
    onDismiss: () -> Unit
) {
    val joinedLanguages = remember(country.languages) {
        country.languages.joinToString()
    }
    Dialog(onDismissRequest = onDismiss) {
        Column(modifier = modifier) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(
                    country.emoji,
                    fontSize = 30.sp
                )
                Spacer(Modifier.width(16.dp))
                Text(
                    country.name,
                    fontSize = 24.sp
                )
            }
            Spacer(Modifier.height(16.dp))
            Text("Continent: " + country.continent)
            Spacer(Modifier.height(8.dp))
            Text("Capital: " + country.capital)
            Spacer(Modifier.height(8.dp))
            Text("Currency: " + country.currency)
            Spacer(Modifier.height(8.dp))
            Text("Code: " + country.code)
            Spacer(Modifier.height(8.dp))
            Text("Language(s): $joinedLanguages")
        }
    }
}