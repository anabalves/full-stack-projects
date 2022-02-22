import React from "react";
import { Text, View, StyleSheet, Image } from "react-native";
import { TouchableWithoutFeedback } from "react-native-gesture-handler";
import { useNavigation } from "@react-navigation/native";

const Header = () => {
  const navigation = useNavigation();

  const handleOnPress = () => {
    navigation.navigate('Home');
  };

  return (
    <TouchableWithoutFeedback onPress={handleOnPress}>
      <View style={styles.header}>
        <Image
          style={styles.tinyLogo}
          source={require("../../assets/logo.png")}
        />
        <Text style={styles.textLogoPrimary}>Big Game</Text>
        <Text style={styles.textLogoSecondary}>Survey</Text>
      </View>
    </TouchableWithoutFeedback>
  );
};

const styles = StyleSheet.create({
  header: {
    paddingTop: 50,
    height: 90,
    backgroundColor: "#37474F",
    flexDirection: "row",
    justifyContent: "center",
  },
  textLogoPrimary: {
    fontWeight: "bold",
    fontSize: 18,
    fontFamily: "Play_700Bold",
    color: "#ED7947",
    marginLeft: 10,
    marginRight: 5,
  },
  textLogoSecondary: {
    fontWeight: "bold",
    fontFamily: "Play_700Bold",
    fontSize: 18,
    color: "#FFF",
  },
  tinyLogo: {
    width: 25,
    height: 25,
  },
});

export default Header;
