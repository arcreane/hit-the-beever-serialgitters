package com.company;

public class scores{
    /**
     * @author Mathieu Barbé-gayet
     */
    private static String[][] m_ScoresArray = new String[5][2];

    public static void enregistrerScore(int nouveauScore, String pseudo){
        //Conversion du score en String pour stockage dans le tableau
        String nouveauScoreEnString = Integer.toString(nouveauScore);
        //Si le score du joueur est supérieur à zéro, on parcourt le tableau
        if(nouveauScore!=0) {
            for (int positionJoueur = 0; positionJoueur < 4; positionJoueur++) {
                //Si le score stocké n'est pas null
                if (m_ScoresArray[positionJoueur][0] != null) {
                    //Récupération du score de la ligne actuelle
                    int scoreLu = Integer.parseInt(m_ScoresArray[positionJoueur][0]);
                    //Et si le score stocké est plus grand que le nouveau score, on change de ligne
                    if (scoreLu >= nouveauScore){
                        continue;
                    }else{ //Sinon, on décale le reste des scores
                        int indexDecalageInferieur=0;
                        for(int indexDecalage = 1; indexDecalage <= 4; indexDecalage++){
                            if((positionJoueur+indexDecalage)<m_ScoresArray.length){
                                //Si la prochaine ligne est null, on décale l'entrée actuelle d'un cran puis on sort de la boucle de décalage des scores
                                if(m_ScoresArray[(positionJoueur+indexDecalage)][1]==null){
                                    m_ScoresArray[(positionJoueur+indexDecalage)][1] = m_ScoresArray[positionJoueur+indexDecalageInferieur][1];
                                    m_ScoresArray[(positionJoueur+indexDecalage)][0] = m_ScoresArray[positionJoueur+indexDecalageInferieur][0];
                                    break;
                                }else{
                                    m_ScoresArray[positionJoueur][1] = pseudo;
                                    m_ScoresArray[positionJoueur][0] = nouveauScoreEnString;
                                }
                                indexDecalageInferieur++;
                            }
                        }

                        //Puis on écrit le nouveau score
                        m_ScoresArray[positionJoueur][1] = pseudo;
                        m_ScoresArray[positionJoueur][0] = nouveauScoreEnString;
                        break;
                    }
                }else{ //Si le score stocké est null, on inscrit le nouveau score directement
                    m_ScoresArray[positionJoueur][1] = pseudo;
                    m_ScoresArray[positionJoueur][0] = nouveauScoreEnString;
                    break;
                }
            }
        }
    }


    public static void afficherScores(){
        for (int indexScore = 0; indexScore < 5; indexScore++){
            if (m_ScoresArray[indexScore][0] != null){
                System.out.print((indexScore+1)+" "+m_ScoresArray[indexScore][0]+" ");
                System.out.println(m_ScoresArray[indexScore][1]);
            }

        }

    }
}