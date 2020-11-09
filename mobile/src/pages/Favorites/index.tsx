import AsyncStorage from '@react-native-community/async-storage';
import React, { useState } from 'react'
import { View, ScrollView } from 'react-native';
import PageHeader from '../../components/PageHeader';
import TeacherItem, { Teacher } from '../../components/TeacherItem';
import { useFocusEffect } from '@react-navigation/native'

import styles from './styles';

function Favorites() {
    const [favorites, setFavorites] = useState([]);

    function loadFavorites() {
        AsyncStorage.getItem('favorites').then(response => {
            if (response) {
                const favoritedTeachers = JSON.parse(response);

                setFavorites(favoritedTeachers);
            }
        });
    }

    /* useEffect(() => {
        loadFavorites();
    }, []) */ //colchetes vazio -atualiza no inicio, com variavel, sempre que ela for atualizada

    //utilizado useFocusEffect pq a tab page favorites nao é acionada sempre que sogre navegacao com o useEffedt
    useFocusEffect(() => {
        loadFavorites();
    })


    return (
        <View style={styles.container} >
            <PageHeader title="Meus proffys favoritos" />

            <ScrollView
                style={styles.teacherList}
                contentContainerStyle={{
                    paddingHorizontal: 16,
                    paddingBottom: 16,
                }}
            >
                {favorites.map((teacher: Teacher) => {
                    return (
                        <TeacherItem
                            key={teacher.id}
                            teacher={teacher}
                            favorited //isso é igual a ={true}
                        />

                    )
                })}
            </ScrollView>
        </ View >
    )

}

export default Favorites;