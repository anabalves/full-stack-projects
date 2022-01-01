import { GamePlatform } from "./gamePlatform";

export type Game = {
  id: number;
  title: string;
  platform: GamePlatform;
  label: string;
  value: number;
};